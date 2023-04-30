package racingCar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

	private List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public void moveCars(MovingStrategy strategy) {
		cars.forEach(car ->
			car.move(strategy)
		);
	}

	public List<Car> findWinners() {
		Position winnersPosition = findWinnerPosition();
		return cars.stream()
			.filter(car -> car.getPosition().equals(winnersPosition))
			.collect(Collectors.toList());
	}

	private Position findWinnerPosition() {
		Position maxPosition = new Position();
		for (Car car : this.cars) {
			if (maxPosition.lessThan(car.getPosition())) {
				maxPosition = car.getPosition();
			}
		}
		return maxPosition;
	}


	public List<Car> getCars() {
		return cars;
	}
}
