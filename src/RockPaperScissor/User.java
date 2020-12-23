package RockPaperScissor;

import java.util.Scanner;

public class User {

    private Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public Move getMove() {
        // Prompt the user
        System.out.print("Rock, paper, or scissors? ");

        // Get the user input
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
            // User has entered a valid input
            switch (firstLetter) {
                case 'R':
                    return Move.ROCK;
                case 'P':
                    return Move.PAPER;
                case 'S':
                    return Move.SCISSORS;
            }
        }

        // User has not entered a valid input. Prompt again.
        return getMove();

    }
    public boolean playAgain() {
        System.out.print("Do you want to play again? ");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }
}
