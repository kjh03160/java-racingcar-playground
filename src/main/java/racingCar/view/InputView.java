package racingCar.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
	private static final String DELIMITER = ",";
	public static List<String> splitNames(String name) {
		return List.of(name.split(DELIMITER));
	}
}
