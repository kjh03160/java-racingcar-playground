package racingCar.domain;

import java.util.Objects;

public class Position {
	private int value;

	public Position() {
		this.value = 0;
	}

	public Position(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("위치는 음수가 될 수 없습니다.");
		}
		this.value = value;
	}

	public void move() {
		this.value += 1;
	}

	public boolean lessThan(Position position) {
		return this.value < position.value;
	}

	public int getPosition() {
		return this.value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Position position = (Position)o;
		return value == position.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
