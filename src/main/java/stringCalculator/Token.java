package stringCalculator;

public class Token {
	private String token;

	public Token(String token) {
		this.token = token;
	}

	public Integer getToken() {
		return checkStringAndGetInteger(this.token);
	}

	public static Integer checkStringAndGetInteger(String intString) {
		try {
			int integer = Integer.parseInt(intString);
			if (integer < 0) {
				throw new RuntimeException("invalid string");
			}
			return integer;
		} catch (Exception e) {
			throw new RuntimeException("invalid string");
		}
	}
}
