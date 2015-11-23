/**
 * Name: dot
 * @author Shoji Moto
 * @version 1.0
 * @since 11/23/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program determines and prints the number of dots based on title and page length
 * 
 * Reinforced skill on methods
 * 
 */

import java.io.*;
import java.util.Scanner;

public class dot {
    public static int dotFunction (int n1, int n2) { //dotFunction method
        
        int dotcount = 0; //initialize dotcount
        int pageLength = 0; //initialize pageLength
        
        if (n2 < 10) { //find number of digits in the int page
            pageLength = 1;
        }
        else if (n2 < 100) {
            pageLength = 2;
        }
        else if (n2 < 1000) {
            pageLength = 3;
        }
        else if (n2 < 10000) {
            pageLength = 4;
        }
        
        dotcount = 50 - n1 - pageLength; //determine number of dots
        return dotcount; //return value to main method
    } 
    
    public static void main(String[] args) { //Main method
        
        Scanner table = new Scanner(System.in);
        System.out.print("Enter the title: ");
        String title = table.nextLine(); //User Inputted Title assigned as title
        
        System.out.print("\nEnter the page number: ");
        int page = table.nextInt();
        System.out.println(); //User Input assigned as page
        
        int titleLength = title.length(); //find length of string title
        
        int dots = dotFunction(titleLength, page); //objects dots created
        
        System.out.print("\n" + title);
        while (dots > 0) { //print correct number of dots needed
            System.out.print(".");
            dots--;
        }
        System.out.print(page);
    }
}

/*
 * Output:
Enter the title: An Introduction to Java

Enter the page number: 5


An Introduction to Java..........................5



Enter the title: Simple Data Types

Enter the page number: 27


Simple Data Types...............................27



Enter the title: Harry Potter

Enter the page number: 934


Harry Potter...................................934
*/