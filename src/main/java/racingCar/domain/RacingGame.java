package racingCar.domain;

import java.util.List;
import java.util.stream.Collectors;

import racingCar.domain.Car;
import racingCar.domain.MovingStrategy;
import racingCar.utils.RandomNumberGenerator;
import racingCar.view.ResultView;

public class RacingGame {
	private List<Car> cars;
	private int round;
	private final MovingStrategy strategy;

	public RacingGame(List<String> carNames, int round, MovingStrategy strategy) {
		this.cars = carNames.stream()
			.map(Car::new)
			.collect(Collectors.toList());
		this.round = round;
		this.strategy = strategy;
	}

	RacingGame(List<Car> cars, MovingStrategy strategy) {
		this.cars = cars;
		this.strategy = strategy;
	}

	public void race() {
		for (int i = 0; i < round; i++) {
			moveCars();
			ResultView.printCurrentCarsPosition(cars);
		}
	}

	public List<Car> findWinners() {
		int winnersPosition = findWinnerPosition();
		return cars.stream()
			.filter(car -> car.getCurrentPosition() == winnersPosition)
			.collect(Collectors.toList());
	}

	private int findWinnerPosition() {
		int maxPosition = 0;
		for (Car car: this.cars) {
			if (car.getCurrentPosition() > maxPosition) {
				maxPosition = car.getCurrentPosition();
			}
		}
		return maxPosition;
	}

	private void moveCars() {
		cars.forEach(car ->
			car.move(strategy)
		);
	}

	public List<Car> getCars() {
		return cars;
	}
}
