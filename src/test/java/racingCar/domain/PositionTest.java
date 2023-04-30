package racingCar.domain;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {
	@Test
	void 음수가_들어오면_예외를_던진다() {
		assertThatThrownBy(() -> new Position(-1))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void move() {
		Position position = new Position(0);
		position.move();
		assertThat(position).isEqualTo(new Position(1));
	}

}
