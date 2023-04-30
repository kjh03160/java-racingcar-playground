package racingCar.domain;

import java.util.Objects;

import racingCar.utils.NameValidator;

public class Car {

	private Name name;
	private Position position;

	public Car(String name) {
		this.name = new Name(name);
		this.position = new Position();
	}

	Car(String name, int position) {
		this.name = new Name(name);
		this.position = new Position(position);
	}

	public void move(MovingStrategy strategy) {
		if (strategy.movable()) {
			this.position.move();
		}
	}

	public Position getPosition() {
		return this.position;
	}

	public String getName() {
		return name.getValue();
	}

	@Override
	public String toString() {
		StringBuilder positionString = new StringBuilder();
		for (int i = 0; i < this.position.getPosition(); i++) {
			positionString.append("-");
		}
		return this.name + " : " + positionString;
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
