package racingCar.domain;

import java.util.Objects;

import racingCar.utils.NameValidator;

public class Car implements Comparable<Car>{

	private String name;
	private int position;

	public Car(String name) {
		NameValidator.validateName(name);
		this.name = name;
		this.position = 0;
	}

	Car(String name, int position) {
		NameValidator.validateName(name);
		this.name = name;
		this.position = position;
	}

	public void move(MovingStrategy strategy) {
		if (strategy.movable()) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car)o;
		return position == car.position && Objects.equals(name, car.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, position);
	}
}
