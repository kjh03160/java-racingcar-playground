package racingCar.utils;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberGenerator {
	private static final int MAX_BOUND = 9;

	public static int generate() {
		Random random = new Random();
		int number = random.nextInt(MAX_BOUND + 1);
		return number;
	}
}
