package hw07.test;

import hw07.test.fakes.DiceImplSpy;
import hw07.game.Game;
import hw07.game.Player;
import hw07.test.fakes.GameWinnerPrinterSpy;

public class GameTest {

	private final Player player2 = new Player("Петя");
	private final Player player1 = new Player("Вася");
	private Game game;

	@SuppressWarnings("ObjectEquality")
	public void testWinnerPlayer2() {

		final DiceImplSpy dice = new DiceImplSpy(3, false);
		final GameWinnerPrinterSpy winnerPrinter = new GameWinnerPrinterSpy();
		game = new Game(dice, winnerPrinter);

		game.playGame(player1, player2);
		if (winnerPrinter.getWinner().equals(player2)) {
			System.out.println("Тест c определением победителя пройден");
		} else {
			System.err.println("Тест c определением победителя провален");
		}
		game = null;
	}

	public void testLoserPlayer1() {

		final DiceImplSpy dice = new DiceImplSpy(3, false);
		final GameWinnerPrinterSpy winnerPrinter = new GameWinnerPrinterSpy();
		game = new Game(dice, winnerPrinter);

		game.playGame(player1, player2);
		if (!winnerPrinter.getWinner().equals(player1)) {
			System.out.println("Тест c определением проигравшего пройден");
		} else {
			System.err.println("Тест c определением проигравшего провален");
		}
		game = null;
	}

	public void sameNumberTest() {

		final DiceImplSpy dice = new DiceImplSpy(3, true);
		final GameWinnerPrinterSpy winnerPrinter = new GameWinnerPrinterSpy();
		game = new Game(dice, winnerPrinter);

		game.playGame(player1, player2);
		if (isNotWinner(winnerPrinter)){
			System.out.println("Тест с одинаковыми числами пройден");
		}else {
			System.err.println("Тест с одинаковыми числами провален");
		}
		game = null;
	}

	private boolean isNotWinner(final GameWinnerPrinterSpy winnerPrinter) {

		return !winnerPrinter.getWinner().equals(player1.getName()) && !winnerPrinter.getWinner().equals(player2.getName());
	}
}
