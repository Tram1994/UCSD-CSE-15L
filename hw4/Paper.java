/*
 * Paper class
 * 
 * Determines the outcome of the round if the player choses Paper.
 */
class Paper {
    // Outcomes constants
    private static final int WIN = 0;
    private static final int LOSS = 1;
    private static final int TIE = 2;

    // Choices constants
    private static final int ROCK = 0;
    private static final int PAPER = 1;

    // Tie if CPU chooses Paper, win if CPU chooses Rock, loss otherwise.
    protected static int beats(int cpuChoice) {
        if (cpuChoice == PAPER) return TIE;
        return cpuChoice == ROCK ? WIN : LOSS;
    }
}
