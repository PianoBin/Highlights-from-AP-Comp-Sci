/**
 * Name: vowel_stars
 * @author Shoji Moto
 * @version 1.0
 * @since 11/25/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program finds instances of vowels in words and replaces them with asterisks
 * 
 * Reinforced skill on methods
 * 
 */

import java.io.*;
import java.util.Scanner;

public class vowel_stars {
    public static void vowelFinder(String username) { //vowelFinder method
        username = username.replaceAll("a", "*"); //replace vowels with *
        username = username.replaceAll("e", "*");
        username = username.replaceAll("i", "*");
        username = username.replaceAll("o", "*");
        username = username.replaceAll("u", "*");

        System.out.println("New Name: " + username); //print name with required concatenation 
    }
    
    public static void main(String[] args) { //main method
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = new String(name.nextLine()); //user input assigned to string username
        System.out.println();
        
        String Shoji = new String("Shoji Moto");
        while (username.equals(Shoji)) { //required loop control
            System.out.println("Hey, that's my name!");
            System.exit(0);
        }
        
        vowelFinder(username); //pass username to vowelFinder method
    }
}

/*
 * Output:
Enter your name: Molly Fisher

New Name: M*lly F*sh*r


Enter your name: Alan Alda

New Name: Al*n Ald*


Enter your name: Mickey Mouse

New Name: M*ck*y M**s*


Enter your name: Shoji Moto

Hey, that's my name!
*/