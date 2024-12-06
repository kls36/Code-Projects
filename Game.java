/*
 *  Written by Kelly SUllivan
 */


import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		// variable for the scores
	
		int userPoints = 0;
		int compPoints = 0;
		
		
		/// intro game
		System.out.println("Welcome to Rock, Paper, Scissors! Best 2 out of 3!");
		
		
		//asks for user input
		for (int round = 1; round <=3; round++) {
			System.out.println("Round " + round + ":");
			System.out.println("Enter 'Rock', 'Paper', 'Scissors'.");
			String userChoice = keyboard.nextLine();
			
			
			//computer choices
			int compChoices = random.nextInt(3);
			String compChoice = null;
			
			switch (compChoices) {
			case 0:
				compChoice = "Rock";
				break;
			case 1:
				compChoice = "Paper";
				break;
			case 2:
				compChoice = "Scissors";
				break;
			
			}
			
		String score;
		
		//testing results
		if (userChoice.equals(compChoice)) {
			score = "Tie";
					
		} else if (userChoice.equalsIgnoreCase("Rock") && compChoice.equals("Scissors") ||
				userChoice.equalsIgnoreCase("Paper") && compChoice.equals("Rock") ||
				userChoice.equalsIgnoreCase("Scissors") && compChoice.equals("Paper")) {
			score = "User won!";
			userPoints++;
			
		} else if (!userChoice.equals("Rock") &&
				!userChoice.equals("Paper") &&
				!userChoice.equals("Scissors")) {
			score = "Computer won! You entered an invalid choice!";
			
		} else {
			score = "Computer won!";
			compPoints++;
			
		}
			
		System.out.println("Computer played " + compChoice);
		System.out.println("This round " + score);
		
			
		}
		
		String endScore;
		if (userPoints > compPoints) {
			endScore = "User won";
			
		} else if (userPoints < compPoints) {
			endScore = "Computer won";
			
		} else {
			endScore = "You tied";
		}
		
		//give results
	System.out.println(endScore + " this game!");
	
	
	//ask to play again
	System.out.println("Do you want to play again? 'yes' or 'no'");
	
    String playAgain = keyboard.nextLine();
    
    // If the user wants to play again, restart the game
    if (playAgain.equals("yes")) {
        main(args);
    } else {
        // Otherwise, terminate the program
        System.out.println("Thank you for playing!");
    }
    
    // Close the scanner
    keyboard.close();
		
		
	}
		
		
		
		
	}
	
