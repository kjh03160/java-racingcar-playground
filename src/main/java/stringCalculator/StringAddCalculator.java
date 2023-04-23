package stringCalculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {
	private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.)\n(.*)");
	private static final String DEFAULT_DELIMITER = ":|,";

	public static int splitAndSum(String input) {

		String delimiter = DEFAULT_DELIMITER;
		Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(input);
		if (matcher.find()) {
			delimiter = matcher.group(1);
			input = matcher.group(2);
		}
		return 0;
	}


}
