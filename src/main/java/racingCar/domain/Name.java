package racingCar.domain;

import java.util.Objects;

import racingCar.utils.NameValidator;

public class Name {

	private String value;

	public Name(String value) {
		NameValidator.validateName(value);
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Name name = (Name)o;
		return Objects.equals(value, name.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	public String getValue() {
		return value;
	}
}
