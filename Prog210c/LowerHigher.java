/*
 * Name: LowerHigher
 * @author: Shoji Moto
 * @version: 1.0
 * Date: 11/5/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses loops and if-else statements to create a game
 * 
 * Reinforced skill on if-else statements
 * 
 */

import java.io.*;
import java.util.*;

public class LowerHigher {
    public static void main(String[] args) {
        
        Scanner game = new Scanner(System.in); //Creating a Scanner object
        
        //Initializing Variables
        int guess = 0; 
        int real = 0;
        int guessCount = 0;
        
        String playAgain = null;
        int length = 0;
        
        do {
            Random rndm = new Random();
            real = rndm.nextInt(101); //Generate a random number between 1 and 100
            
            System.out.println("I am thinking of a number between 1 and 100");
            
            do {
                System.out.print("What do you think it is? ");
                guess = game.nextInt(); //User's guess
                
                guessCount++; //Remember number of guesses
                
                if (guess < real) { //If guess too low
                    System.out.println("Higher--Try Again");
                } 
                else if (guess > real) { //If guess too high
                    System.out.println("Lower--Try Again");
                }
                else { //If correct
                    System.out.println("You got it right in " + guessCount + " guesses.");
                }
            } while (guess != real); //keep looping if wrong answer
            if (guessCount <= 5) {
                System.out.println("Good job! You won the bonus challenge! ");
            }
            
            System.out.println("Would you like to play again? Type YES or NO");
            System.out.println("Bonus Challenge: Guess the number in 5 tries");
            
            playAgain = game.next(); //User responds with yes or no
            length = playAgain.length(); //Check length of response
            
            guessCount = 0; //reset guess counter
        } while (length > 2);
        
        System.out.println("Thanks for playing!");
    }
}

/*
 * Output:
 * 
I am thinking of a number between 1 and 100
What do you think it is? 55
Higher--Try Again
What do you think it is? 75
Higher--Try Again
What do you think it is? 85
You got it right in 3 guesses.
Good job! You won the bonus challenge! 
Would you like to play again? Type YES or NO
Bonus Challenge: Guess the number in 5 tries
No
Thanks for playing!
*/