package src;

public class Game {
    private Player player1;
    private Player player2;
    private final Result Result;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.Result = new Result();
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void printResult() {
        System.out.println(Result);
    }

    public void play(int numberOfGames) {
        Result.setNumberOfGames(numberOfGames);
        player1.setChoice(Choice.ROCK);
        for(int i = 0 ; i < numberOfGames ; i++){
            player2.setChoice(Choice.getRandomChoice());
            int result = player1.compareTo(player2);
            if (result == 0) {
                Result.incrementDraw();
            } else if (result > 0) {
                Result.incrementP1();
            } else {
                Result.incrementP2();
            }
        }
    }
}
