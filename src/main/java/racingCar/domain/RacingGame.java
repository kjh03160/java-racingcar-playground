package racingCar.domain;

import java.util.List;
import java.util.stream.Collectors;

import racingCar.view.ResultView;

public class RacingGame {

	private Cars cars;
	private int round;
	private final MovingStrategy strategy;

	public RacingGame(List<String> carNames, int round, MovingStrategy strategy) {
		this.cars = new Cars(carNames.stream()
			.map(Car::new)
			.collect(Collectors.toList()));
		this.round = round;
		this.strategy = strategy;
	}

	public void race() {
		for (int i = 0; i < round; i++) {
			this.cars.moveCars(this.strategy);
			ResultView.printCurrentCarsPosition(cars.getCars());
		}
	}

	public List<Car> findWinners() {
		return cars.findWinners();
	}

	public Cars getCars() {
		return cars;
	}
}
