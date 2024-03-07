package src;

public enum Choice {
    ROCK ,
    PAPER,
    SCISSORS;

    public static Choice getChoice(int choice) {
        return switch (choice) {
            case 1 -> ROCK;
            case 2 -> PAPER;
            case 3 -> SCISSORS;
            default -> null;
        };
    }

    public static int getChoice(Choice choice) {
        return switch (choice) {
            case ROCK -> 1;
            case PAPER -> 2;
            case SCISSORS -> 3;
        };
    }

    public static Choice getRandomChoice() {
        return switch ((int) (Math.random() * 3) + 1) {
            case 1 -> ROCK;
            case 2 -> PAPER;
            case 3 -> SCISSORS;
            default -> null;
        };
    }
}
