package racingCar.domain;

import racingCar.utils.NameValidator;

public class Car {
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
			this.position += amount;
		}
	}

	public int getCurrentPosition() {
		return this.position;
	}
}
