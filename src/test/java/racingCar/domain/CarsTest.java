package racingCar.domain;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CarsTest {

	@Test
	void moveCars() {
		Car car = new Car("1");

		Cars cars = new Cars(List.of(car));
		cars.moveCars(() -> true);
		cars.getCars().forEach(c ->
					assertThat(c.getPosition()).isEqualTo(new Position(1))
				);
	}

	@Test
	void findWinners() {
		Car car1 = new Car("1", 0);
		Car car2 = new Car("2", 1);
		Car car3 = new Car("3", 1);

		Cars cars = new Cars(List.of(car1, car2, car3));
		assertThat(cars.findWinners()).containsExactly(car2, car3);
	}

}
