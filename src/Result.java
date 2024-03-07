package src;

public class Result {
    int draw = 0;
    int p1 = 0;
    int p2 = 0;
    int numberOfGames = 0;

    public Result(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public Result() {
    }


    public void incrementDraw() {
        draw++;
    }

    public void incrementP1() {
        p1++;
    }

    public void incrementP2() {
        p2++;
    }

    @Override
    public String toString() {
        return "Player A wins " + p1+ " out of " + numberOfGames + " games\n" +
                "Player B wins " + p2+ " out of " + numberOfGames + " games\n" +
                "Draws: " + draw+ " out of " + numberOfGames + " games";
    }
}
