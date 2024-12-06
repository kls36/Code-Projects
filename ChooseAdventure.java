/*
Written by Kelly Sullivan
*/

import java.util.Scanner;

public class ChooseAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//welcomes user to game and sets up first choice
		System.out.println("Welcome to the choose your own adventure game!");
		System.out.println("You find yourself in an empty room with 3 doors. One is yellow, one is blue, one is pink. "
				+ "Which door will you choose. Enter 'yellow' 'blue' or 'pink'.");
		String decision1 = keyboard.nextLine();
		// sets up options for if the user enters the room with the yellow door
		if (decision1.equals("yellow")) {
            System.out.println("You open the yellow door and see a pot of gold being guarded by a sleeping Leprechaun. "
            		+ "Do you choose to wake him or try and take the pot of gold. ");
            System.out.println("Enter 1 to wake the Leprechaun.");
            System.out.println("Enter 2 to attempt to steal the gold.");

            int decision2 = keyboard.nextInt();
            // prompts user to pick a number that determines their fate
            if (decision2 == 1) {
                System.out.println("You wake up the sleeping leprechaun. He is very exicted to see you! "
                		+ "He tells you he is thinking of a number 1-10. Guess correctly and you will get the gold. ");
                System.out.println("Enter a number 1-10");
                
                int decision3 = keyboard.nextInt();
                // tells the users their fate
                if (decision3 == 6) {
                	System.out.println("You guessed the number correctly! "
                			+ "The Leprechaun gives you the pot of gold, snaps his fingers, and sends you home! Thanks for playing!");
                	System.exit(1);
                }
                else if (decision3 != 6) {
                	System.out.println("You guessed the number incorrcetly. The number was 6. "
                			+ "The leprechaun is angry that you woke him up AND got the number wrong so he sends you to the other side of the rainbow where you forever stay. The end.");
                	System.exit(1);
                }// tells the users their fate
            } else if (decision2 == 2) {
                System.out.println("You attempt to steal the gold. You tried so hard to be quiet but you still woke up the leprechaun. "
                		+ "He is very angry and he he sends you to the other side of the rainbow where you forever stay. The end.");
                System.exit(1);
                
            } else {
            	// ends game if they didn't enter a valid option
                System.out.println("Invalid input. Game over.");
                System.exit(1);
            }
         // sets up options for if the user enters the room with the blue door
        } else if (decision1.equals("blue")) {
            System.out.println("You open the blue door and see that you are outside. It is night time and you realize it must be very late, but you see a path in the distance and it intrigues you."
            		+ " Do you feel sleepy? Enter yes or no. ");
            String sleepy = keyboard.nextLine();
            System.out.println("Do you want to follow the path? Enter yes or no.");
            String follow = keyboard.nextLine();
            
            // compound boolean to tell users what will happen after the 2 choices they just made
            if (sleepy.equals("yes") && follow.equals("yes")) {
            	System.out.println("You start to follow the path, yawning all the while and after no time at all, you find yourself in a town. "
            			+ "Just in front of a starbucks! You got just what you wanted! Game over!");
            	System.exit(1);
            } else if (sleepy.equals("yes") && follow.equals("no")) {
            	System.out.println("You are oh so very tired, so you lay down on the soft grass and fall asleep. "
            			+ "You wake up and realize this was all just a dream. Game over!");
            	System.exit(1);
            } else if (sleepy.equals("no") && follow.equals("no")) {
            	System.out.println("With nothing else to do you just stand there. You stand and stand. "
            			+ "Years go by and you wish you had chosen to take the path. Game over.");
            	System.exit(1);
            } else if (sleepy.equals("no") && follow.equals("yes")) {
            	System.out.println("You wander down the dark path and its a litle spooky! You are scared and decide to run. "
            			+ "Soon enough you find yourself in a lovely village. You live out the rest of your days there. The end! Game over! Happily ever after!");
            	System.exit(1);
            } else {
                System.out.println("Invalid input. Game over.");
                System.exit(1);
            }		
         // sets up options for if the user enters the room with the pink door
        } else if (decision1.equals("pink")) {
            System.out.println("You go in the pink room and it is on fire! You see a unicorn in the corner who looks oh so scared of the flames!");
            System.out.println("Do you want to: 1. enter the room to save the unicorn or 2. close the door and try to save yourself? ");
            System.out.println("Enter 1 or 2");
            int save = keyboard.nextInt();
            //tells users their fate
            if (save == 1) {
                System.out.println("You bravely enter the room and lead the unicorn to safety! He is so grateful. "
                		+ "He lets you on his back and all the sudden you are soaring through the clouds. You live happily ever after. The end.");
                System.exit(1);
            } else if (save == 2) {
                System.out.println("You close the door but it is too late. The fire speads and the outlook isn't good for you. The end :(");
                System.exit(1);
            } else {
                System.out.println("Invalid input. Game over.");
                System.exit(1);
            }
            System.out.println("Invalid input. Game over.");
            System.exit(1);
        }

        keyboard.close();
    }
}
	
