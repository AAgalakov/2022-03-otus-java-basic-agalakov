package hw07.test.fakes;

import hw07.game.Dice;

public class DiceImplSpy implements Dice {
	private final boolean sameNumbers;
	private int number;

	public DiceImplSpy(final int number, final boolean sameNumbers) {
		this.sameNumbers = sameNumbers;
		this.number = number;
	}

	@Override
	public int roll() {

		if (sameNumbers) {
			return number;
		}
		return number++;
	}
}
