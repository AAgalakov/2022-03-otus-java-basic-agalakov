package hw07.game;

public class Game {

    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();

        Player winner = (player1Result > player2Result)? player1: player2;
//        Player winner = null;
//        if (player1Result > player2Result){
//            winner = player1;
//        } else if (player2Result > player1Result) {
//            winner = player2;
//        } else {
//            winner = new Player("Ничья");
//        }
        winnerPrinter.printWinner(winner);
    }
}
