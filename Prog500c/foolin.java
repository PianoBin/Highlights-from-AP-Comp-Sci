/**
 * Name: foolin
 * @author Shoji Moto
 * @version 1.0
 * @since 11/24/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program finds the length of a word and prints the word that many times
 * 
 * Reinforced skill on methods
 * 
 */


import java.io.*;
import java.util.Scanner;

public class foolin {
    public static int lengthFinder (String input) { //lengthFinder method
        
        int wordLength = input.length(); //String method to find length
        
        return wordLength; //Return that value
    }
    
    public static int printer (int count, String input) { //printer method
        
        int LineCounter = 0; //initialize a counter
        
        while (LineCounter < count) { //while the counter is less than the actual count
            System.out.println(input); //print the word
            LineCounter++;
        }
        
        return LineCounter; //Return the number of prints
    }
    
    public static void main(String[] args) { //main method
        
        Scanner words = new Scanner(System.in);
        System.out.print("Type a word. ");
        String input = new String(words.nextLine()); //Input assigned as a String Object
        System.out.println();
        
        int count = lengthFinder(input); //pass to lengthFinder method
        
        int print = printer(count, input); //pass to printer method
        
        System.out.println("\n\nSo I printed it " + print + " times");
    }
}


/*
 * Output:
Type a word. Howdy

Howdy
Howdy
Howdy
Howdy
Howdy


So I printed it 5 times


Type a word. Doubtfire

Doubtfire
Doubtfire
Doubtfire
Doubtfire
Doubtfire
Doubtfire
Doubtfire
Doubtfire
Doubtfire


So I printed it 9 times


Type a word. APCS

APCS
APCS
APCS
APCS


So I printed it 4 times
*/