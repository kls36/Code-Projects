/*
 * Written by Kelly Sullivan
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to the 'When will Kelly go home again' guessing game!");

        while (playAgain) {
            // make random number
            Random random = new Random();
            int daysToGuess = random.nextInt(32) + 1;

            // ask for guess
            System.out.println("Guess how many days until Kelly will go home again (between 1 and 32):");

            // take dat guess
            int userGuess = scanner.nextInt();

            // check guess
            if (userGuess == daysToGuess) {
                System.out.println("Congratulations! You guessed it right. Kelly will go home in " + daysToGuess + " days.");
            } else {
                System.out.println("Sorry, that's incorrect. Kelly will go home in " + daysToGuess + " days.");
            }

            // why is she going home
            tellReasonForGoingHome(daysToGuess);

            // play agian
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }

        // close scanner
        scanner.close();
    }
    //why kelly why
    private static void tellReasonForGoingHome(int daysToGuess) {
        String[] scenarios = {
            "she forgot her apple watch.",
            "she has a dermatologist appointment that will be fruitless!",
            "she will want to go to her lovely home gym.",
            "she will have a lot of laundry (frown emoji)",
            "it will be a holiday! Yay!",
            "she will just have gotten a package delivered at home!",
            "she will just really need to sleep in a king sized bed.",
            "millie will be home!",
            "peyton will be home!",
            "parker asked her to!",
            "she will really miss her mommy!",
            "she will really miss her dad!",
            "she will want mirin!",
            "the magic 8 ball will tell her to!",
            "she will have to study in evans like rory had to study in stars hollow but there were mini quiche in her bedroom! make sure there are no quiche in kellys bedroom!",
            "there will be ants and roaches all over her apartment at school and she won't be able to take it any more!",
            "it's will have been too long since she pet a cat!",
            "she will want her mom to buy her groceries.",
            "she will need to use the bottle cleaner.",
            "she will be driving and somehow she will absent mindedly just drive home!",
            
            
            
            
            
            
        };

        Random random = new Random();
        int index = random.nextInt(scenarios.length);
        System.out.println("Kelly is going home in " + daysToGuess + " days because " + scenarios[index]);
    }
}
