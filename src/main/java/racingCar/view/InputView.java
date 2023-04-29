package racingCar.view;

import java.util.List;
import java.util.Scanner;

public class InputView {
	private static final String NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
	private static final String DELIMITER = ",";

	public static void printStartGameMessage() {
		System.out.println(NAME_INPUT_MESSAGE);
	}

	public static List<String> getCarNames() {
		return splitNames(getInput());
	}

	private static String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

	static List<String> splitNames(String name) {
		return List.of(name.split(DELIMITER));
	}
}
