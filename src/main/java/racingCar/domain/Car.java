package racingCar.domain;

import racingCar.utils.NameValidator;

public class Car {
	private String name;
	public Car(String name) {
		NameValidator.validateName(name);
		this.name = name;
	}
}
