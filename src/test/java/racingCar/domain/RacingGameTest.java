package racingCar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class RacingGameTest {

	@Test
	void race() {
		RacingGame racingGame = new RacingGame(List.of("1", "2", "3"), 2, () -> true);
		racingGame.race();

		Cars cars = racingGame.getCars();

		for (Car car : cars.getCars()) {
			assertThat(car.getPosition()).isEqualTo(new Position(2));
		}
	}


}
