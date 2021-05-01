// Imports
import java.util.Scanner;
import java.util.Random;

/* RPS class
 * 
 * Main class for the Rock, Paper, Scissors game.
 */
class RPS {
    // Outcomes constants
    private static final int WIN = 0;
    private static final int LOSS = 1;

    // Choices constants
    private static final int ROCK = 0;
    private static final int PAPER = 1;

    private static final int NUM_CHOICES = 3; // Number of possible choices

    // Main program
    public static void main(String[] args) {
        // Scores, CPU choice, and outcome of round
        int playerScore = 0, cpuScore = 0, cpuChoice, outcome;
        // True if player enters a choice other than R, P, or S
        boolean invalidChoice = false;
        // Player input
        String input;

        Scanner scanner = new Scanner(System.in); // To read input
        Random randomizer = new Random(); // To generate a random number

        // Welcome prompt
        System.out.println("Welcome to Rock, Paper, Scissors!\n\n" +
                           "Here is a quick refresher of the rules:\n" +
                           "- Rock beats Scissors\n" +
                           "- Scissors beats Paper\n" +
                           "- Paper beats Rock");
        
        while (true) {
            // Prompt player then list out choices
            if (invalidChoice) {
                System.out.println("\nInvalid choice. Valid choices are:");
                invalidChoice = false;
            } else 
                System.out.println("\nEnter your choice:");

            System.out.println("(R)ock\n(P)aper\n(S)cissors\n");

            // Read player input
            try {
                input = scanner.nextLine();
            } catch(Exception e) {
                break;
            }

            input = input.toUpperCase();
            
            // Randomize CPU choice
            cpuChoice = randomizer.nextInt(NUM_CHOICES);

            // Determine round outcome
            switch(input) {
                case "R":
                case "ROCK":
                    outcome = Rock.beats(cpuChoice);
                    break;
                case "P":
                case "PAPER": 
                    outcome = Paper.beats(cpuChoice);
                    break;
                case "S":
                case "SCISSORS":
                    outcome = Scissors.beats(cpuChoice);
                    break;
                default: 
                    invalidChoice = true;
                    continue;
            }

            // Print out round outcome and update score
            System.out.print("\nThe CPU chose " + 
                             ((cpuChoice == ROCK) ? "Rock" :
                             cpuChoice == PAPER ? "Paper" : "Scissors") +
                             "! ");

            switch(outcome) {
                case WIN:
                    System.out.println("You win :)");
                    ++playerScore;
                    break;
                case LOSS:
                    System.out.println("You lose :(");
                    ++cpuScore;
                    break;
                default:
                    System.out.println("It's a tie :/");
            }

            // Print score and prompt player to play again
            System.out.println("Score: " + 
                               playerScore + " (player) - " +
                               cpuScore + " (CPU)\n\n" + 
                               "Would you like to play again? (Y/N)\n");
            
            // Read player input
            try {
                input = scanner.nextLine();
            } catch(Exception e) {
                break;
            }

            input = input.toUpperCase();
            
            // Reprompt if input is not Y/N
            while (!input.equals("Y") && !input.equals("YES") &&
                   !input.equals("N") && !input.equals("NO")) {
                System.out.println("\nWould you like to play again? (Y/N)\n");

                try {
                    input = scanner.nextLine();
                } catch(Exception e) {
                    break;
                }

                input = input.toUpperCase();
            }

            // Loop again if yes, break otherwise
            if (input.equals("N") || input.equals("NO")) break;
        }

        // Be polite
        System.out.println("\nThank you for playing Rock, Paper, Scissors!");
    }
}
