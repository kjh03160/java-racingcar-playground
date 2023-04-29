package racingCar;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import racingCar.domain.Car;
import racingCar.utils.RandomNumberGenerator;
import racingCar.view.InputView;
import racingCar.view.ResultView;

public class RacingGame {
	public static void main(String[] args) {
		InputView.printStartGameMessage();
		List<Car> cars = InputView.getCarNames()
			.stream()
			.map(Car::new)
			.collect(Collectors.toList());
		InputView.printRoundInputMessage();
		int round = InputView.getRound();

		for (int i = 0; i < round; i++) {
			cars.forEach(car -> car.move(RandomNumberGenerator.generate()));
			ResultView.printCurrentCarsPosition(cars);
		}

		ResultView.printWinner(cars);
	}
}
