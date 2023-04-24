package racingCar;

public class NameValidator {
	private static final int MAX_NAME_LENGTH = 5;
	public static void validateName(String name) {
		if (name == null || name.isEmpty())  {
			throw new IllegalArgumentException("이름은 최소 1자 이상이여야 합니다.");
		}
		if (name.length() > MAX_NAME_LENGTH) {
			throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
		}
	}
}
