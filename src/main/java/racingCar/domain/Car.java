package racingCar.domain;

import racingCar.utils.NameValidator;

public class Car implements Comparable<Car>{

	private String name;
	private int position;
	private static final int MINIMUM_TO_MOVE = 4;

	public Car(String name) {
		NameValidator.validateName(name);
		this.name = name;
		this.position = 0;
	}

	public void move(int amount) {
		if (amount >= MINIMUM_TO_MOVE) {
			this.position += 1;
		}
	}

	public int getCurrentPosition() {
		return this.position;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder positionString = new StringBuilder();
		for (int i = 0; i < this.position; i++) {
			positionString.append("-");
		}
		return this.name + " : " + positionString;
	}

	@Override
	public int compareTo(Car o) {
		return o.position - this.position;
	}
}
