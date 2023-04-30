package racingCar.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarTest {
	@Test
	void 자동차를_생성한다(){
		assertThatNoException().isThrownBy(()-> new Car("name"));
		assertThatNoException().isThrownBy(()-> new Car("123"));
		assertThatThrownBy(()-> new Car(""))
			.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(()-> new Car(null))
			.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(()-> new Car("123456"))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void 값이_4이상일_경우_자동차는_움직인다() {
		Car car = new Car("name");
		car.move(() -> false);
		assertThat(car.getPosition()).isEqualTo(new Position(0));
		car.move(() -> true);
		assertThat(car.getPosition()).isEqualTo(new Position(1));
	}

	@Test
	void 현재_위치를_이름과_함께_출력한다() {
		Car car = new Car("name");
		assertThat(car.toString()).isEqualTo("name : ");
		car.move(() -> true);
		assertThat(car.toString()).isEqualTo("name : -");
		car.move(() -> false);
		assertThat(car.toString()).isEqualTo("name : -");
		car.move(() -> true);
		assertThat(car.toString()).isEqualTo("name : --");
	}
}
