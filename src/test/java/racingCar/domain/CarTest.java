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
		car.move(3);
		assertThat(car.getCurrentPosition()).isEqualTo(0);
		car.move(4);
		assertThat(car.getCurrentPosition()).isEqualTo(4);
	}
}
