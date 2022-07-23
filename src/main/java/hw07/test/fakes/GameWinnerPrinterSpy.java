package hw07.test.fakes;

import hw07.game.GameWinnerPrinter;
import hw07.game.Player;

public class GameWinnerPrinterSpy implements GameWinnerPrinter {
	private String winnerName;
	@Override
	public void printWinner(final Player winner) {
		winnerName = winner.getName();
	}

	public String getWinnerName() {

		return winnerName;
	}
}
