package hw07.test.fakes;

import hw07.game.GameWinnerPrinter;
import hw07.game.Player;

public class GameWinnerPrinterSpy implements GameWinnerPrinter {
	private Player winner;
	@Override
	public void printWinner(final Player winner) {
		this.winner = winner;
	}

	public Player getWinner() {

		return winner;
	}
}
