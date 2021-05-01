/*
 * Scissors class
 * 
 * Determines the outcome of the round if the player choses Scissors.
 */
class Scissors {
    // Outcomes constants
    private static final int WIN = 0;
    private static final int LOSS = 1;
    private static final int TIE = 2;

    // Choices constants
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    // Tie if CPU chooses Scissors, win if CPU chooses Paper, loss otherwise.
    protected static int beats(int cpuChoice) {
        if (cpuChoice == SCISSORS) return TIE;
        return cpuChoice == PAPER ? WIN : LOSS;
    }
}