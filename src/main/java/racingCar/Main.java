package racingCar;

import java.util.List;

import racingCar.domain.RacingGame;
import racingCar.domain.RandomMoveStrategy;
import racingCar.view.InputView;
import racingCar.view.ResultView;

public class Main {

	public static void main(String[] args) {
		InputView.printStartGameMessage();
		List<String> carNames = InputView.getCarNames();
		InputView.printRoundInputMessage();
		int round = InputView.getRound();

		RacingGame racingGame = new RacingGame(carNames, round, new RandomMoveStrategy());
		racingGame.race();
		ResultView.printWinner(racingGame.findWinners());
	}
}
