package racingCar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class RacingGameTest {

	@Test
	void race() {
		RacingGame racingGame = new RacingGame(List.of("1", "2", "3"), 1, () -> true);
		racingGame.race();
		List<Car> cars = racingGame.getCars();
		for (Car car : cars) {
			assertThat(car.getCurrentPosition()).isEqualTo(1);
		}
	}

	@Test
	void findWinners() {
		Car car1 = new Car("1", 0);
		Car car2 = new Car("2", 1);
		Car car3 = new Car("3", 1);

		RacingGame racingGame = new RacingGame(List.of(car1, car2, car3), new RandomMoveStrategy());
		assertThat(racingGame.findWinners()).containsExactly(car2, car3);
	}
}
