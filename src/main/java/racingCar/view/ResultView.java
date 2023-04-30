package racingCar.view;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import racingCar.domain.Car;

public class ResultView {
	private static final String RESULT_MESSAGE = "실행 결과";
	private static final String WINNER_MESSAGE = "가 최종 우승했습니다.";
	public static void printCurrentCarsPosition(List<Car> cars) {
		System.out.println(RESULT_MESSAGE);
		cars.forEach(System.out::println);
		System.out.println();
	}

	public static void printWinner(List<Car> cars) {
		List<String> winners = extractWinnersName(cars);
		System.out.println(String.join(", ", winners) + WINNER_MESSAGE);
	}

	private static List<String> extractWinnersName(List<Car> cars) {
		return cars.stream()
			.map(Car::getName)
			.collect(Collectors.toList());
	}

}
