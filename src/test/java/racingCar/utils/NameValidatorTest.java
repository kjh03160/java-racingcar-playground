package racingCar.utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racingCar.utils.NameValidator;

public class NameValidatorTest {
	@Test
	void 이름이_5자를_초과하면_예외를_던진다() {
		assertThatThrownBy(() -> {
			NameValidator.validateName("123456");})
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("이름은 5자를 초과할 수 없습니다.");


		assertThatNoException().isThrownBy(() -> NameValidator.validateName("12345"));
	}

	@Test
	void 이름이_비어있으면_예외를_던진다() {
		assertThatThrownBy(() -> {NameValidator.validateName("");})
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("이름은 최소 1자 이상이여야 합니다.");

		assertThatThrownBy(() -> {NameValidator.validateName(null);})
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("이름은 최소 1자 이상이여야 합니다.");

		assertThatNoException().isThrownBy(() -> NameValidator.validateName("1"));
	}
}
