package hw07;

import hw07.game.GameWinnerConsolePrinter;
import hw07.game.Dice;
import hw07.game.DiceImpl;
import hw07.game.Game;
import hw07.game.GameWinnerPrinter;
import hw07.game.Player;

public class Demo {

    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }
}
