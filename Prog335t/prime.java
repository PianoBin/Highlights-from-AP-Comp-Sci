/**
 * Name: prime
 * @author Shoji Moto
 * @version 1.0
 * @since 12/18/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program asks for a number and returns the two prime numbers between it, if not prime
 * itself
 * 
 * Reinforced skill on methods
 * 
 */

import java.io.*;
import java.util.Scanner;

public class prime {
    public static int isPrimeLow(int theInt) { //method to find lower prime number     
        for (int count = 2; count < theInt - 1; count++) { //count begins at 2
            if (theInt % count == 0) { //if divisible by count
                theInt--; //drop the int by 1
                count = 1; //reset count
            }
        }
        
        return theInt;
    }
    
    public static int isPrimeHigh(int theInt) { //method to find higher prime number
        for (int count = 2; count < theInt - 1; count++) { 
            if (theInt % count == 0) {
                theInt++; //same as above method, except the int raises by 1 if not prime
                count = 1;
            }
        }
        
        return theInt;
    }
    
    public static void main(String[] args) { //Main method
        Scanner test = new Scanner(System.in);
        
        String ans;
        do {
            System.out.print("Enter an integer greater than or equal to 2: ");
            int theInt = test.nextInt(); //user input assigned as theInt
            System.out.println();
            
            if (theInt < 2) {
                System.out.println("The integer must be greater than or equal to 2.");
                System.exit(0); //terminate program
            }
            
            int lower = isPrimeLow(theInt); //find lower prime
            int higher = isPrimeHigh(theInt); //find higher prime
            
            System.out.println("N is between the prime numbers " + lower + " and " + higher);
            
            System.out.println("Would you like to check another number? (Y/N): ");
            ans = new String(test.next()); 
        } while (ans.equalsIgnoreCase("Y"));
    }
}


/*
 * Output:
 * 
Enter an integer greater than or equal to 2: 23

N is between the prime numbers 23 and 23
Would you like to check another number? (Y/N): 
Y
Enter an integer greater than or equal to 2: 24

N is between the prime numbers 23 and 29
Would you like to check another number? (Y/N): 
Y
Enter an integer greater than or equal to 2: 32

N is between the prime numbers 31 and 37
Would you like to check another number? (Y/N): 
Y
Enter an integer greater than or equal to 2: 18

N is between the prime numbers 17 and 19
Would you like to check another number? (Y/N): 
Y
Enter an integer greater than or equal to 2: 105

N is between the prime numbers 103 and 107
Would you like to check another number? (Y/N): 
Y
Enter an integer greater than or equal to 2: 2560

N is between the prime numbers 2557 and 2579
Would you like to check another number? (Y/N): 
N
*/