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
}
