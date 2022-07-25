package hw07.test;

import hw07.game.DiceImpl;


public class DiceImplTest {
	private static final int MIN_RANGE = 1;
	private static final int MAX_RANGE = 6;
	private final DiceImpl dice = new DiceImpl();

	public void test(){

		final int roll = dice.roll();
		if (roll >= MIN_RANGE && roll <= MAX_RANGE){
			System.out.printf("Тест с выбрасыванием чисел в диапазоне от %d до %d пройден\n", MIN_RANGE, MAX_RANGE);
		} else {
			System.err.printf("Тест с выбрасыванием чисел в диапазоне от %d до %d провален\n", MIN_RANGE, MAX_RANGE);
		}
	}
}
