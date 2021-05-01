/*
 * Rock class
 * 
 * Determines the outcome of the round if the player choses Rock.
 */
class Rock {
    // Outcomes constants
    private static final int WIN = 0;
    private static final int LOSS = 1;
    private static final int TIE = 2;

    // Choices constants
    private static final int ROCK = 0;
    private static final int SCISSORS = 2;

    // Tie if CPU chooses Rock, win if CPU chooses Scissors, loss otherwise.
    protected static int beats(int cpuChoice) {
        if (cpuChoice == ROCK) return TIE;
        return cpuChoice == SCISSORS ? WIN : LOSS;
    }
}
