package src;

public class Player implements Comparable<Player> {
    private String name;
    private Choice choice;

    public Player(String name) {
        this.name = name;
    }
    public  Player(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", Choice=" + choice +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        if ((this.choice == Choice.ROCK && o.choice == Choice.SCISSORS) || (this.choice == Choice.SCISSORS && o.choice == Choice.PAPER)
                || (this.choice == Choice.PAPER && o.choice == Choice.ROCK)) {
            return 1;
        } else if (this.choice == o.choice) {
            return 0;
        } else {
            return -1;
        }
    }
}
