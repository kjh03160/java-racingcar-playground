package racingCar.view;

import java.util.List;

import racingCar.domain.Car;

public class ResultView {
	private static final String RESULT_MESSAGE = "실행 결과";
	public static void printCurrentCarsPosition(List<Car> cars) {
		System.out.println(RESULT_MESSAGE);
		cars.forEach(System.out::println);
		System.out.println();
	}
}
