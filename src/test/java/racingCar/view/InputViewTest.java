package racingCar.view;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class InputViewTest {
	@Test
	void 입력받은_문자를_쉼표_기준으로_구분한다() {
		assertThat(InputView.splitNames("name")).hasSize(1);
		assertThat(InputView.splitNames("1,2,3")).hasSize(3);
	}
}
