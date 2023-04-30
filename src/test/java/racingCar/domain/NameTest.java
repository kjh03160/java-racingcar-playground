package racingCar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NameTest {
	@Test
	void 이름을_생성한다(){
		assertThatNoException().isThrownBy(()-> new Name("name"));
		assertThatNoException().isThrownBy(()-> new Name("123"));
		assertThatThrownBy(()-> new Name(""))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("이름은 최소 1자 이상이여야 합니다.");
		assertThatThrownBy(()-> new Name(null))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("이름은 최소 1자 이상이여야 합니다.");
		assertThatThrownBy(()-> new Name("123456"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("이름은 5자를 초과할 수 없습니다.");
	}

}
