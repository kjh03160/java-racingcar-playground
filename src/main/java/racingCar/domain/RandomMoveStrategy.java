package racingCar.domain;

import racingCar.utils.RandomNumberGenerator;

public class RandomMoveStrategy implements MovingStrategy{
	private static final int MINIMUM_TO_MOVE = 4;

	@Override
	public boolean movable() {
		return RandomNumberGenerator.generate() >= MINIMUM_TO_MOVE;
	}
}
