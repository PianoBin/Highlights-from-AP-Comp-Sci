/*
 * Name: Bermuda
 * @author: Shoji Moto
 * @version: 1.0
 * Date: 10/16/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses nested loops to print out half of a multiplication table the user asks for
 * 
 * Reinforced skill on nested loops, formatting, and problem solving.
 * 
 */

import java.io.*;
import java.util.Scanner;

public class Bermuda {
    public static void main(String[] args) {
        System.out.println("Multiplication Triangle");
        
        System.out.println();
        
        System.out.println("Number of rows for this triangle: 4"); //Example Table
        System.out.printf("%5d%5d%5d%5d\n", 1, 2, 3, 4);
        System.out.printf("%5d\n", 1);
        System.out.printf("%5d%5d\n", 2, 4);
        System.out.printf("%5d%5d%5d\n", 3, 6, 9);
        System.out.printf("%5d%5d%5d%5d\n", 4, 8, 12, 16);
        
        System.out.println();
        
        int length = 0; //Initializing variables outside of loop
        int rows = 0;
        int rowcount = 0;
        int columns = 0;
        int columncount = 0;
        int multiply = 0;
        
        do {
            Scanner Multi = new Scanner(System.in);
            System.out.print("Please enter the number of rows you would like to print: ");
            rows = Multi.nextInt(); //Assigned to var rows
            System.out.println();
        
            while (rows <= 0 || rows > 10) {
                System.out.println("Please enter a value between 2 and 10. ");
                System.exit(0); //Terminate program if rows not between 1 and 10.
            }
        
            System.out.println("Number of rows for this triangle: " + rows); //Table Header
        
            columns = rows; //Amount of columns = Amount of rows
            columncount = 1; 
            while (columncount <= columns) {
                System.out.printf("%5d", columncount); 
                //Prints first line, showing column numbers
                columncount++;
            }
        
            System.out.println();
        
            rowcount = 1;
            columncount = 2;
            while (rowcount <= rows) {
                System.out.printf("%5d", rowcount); //Prints row number
            
                while (rowcount > 1) { //Do not run loop for first row
                
                    while (columncount <= rowcount) {
                    multiply = rowcount * columncount;
                    System.out.printf("%5d", multiply); 
                    //Shows result of multiplying column number with row number
                    columncount++;
                    }
                
                    break; //exit loop
                 }
            
                System.out.println(); //new line
            
                rowcount++;
                columncount = 2; //reset columncount back to 2
            }
            
            System.out.print("Would you like to continue? (Yes/No) ");
            String cont = Multi.next();
            System.out.println();
            
            length = cont.length(); //Find length of answer (Yes=3, No=2)
        } while(length > 2); //Repeat loop if answer is yes
        
        System.out.println("Thanks for using this program!");
    }
}

/*
Sample Output:

Multiplication Triangle

Number of rows for this triangle: 4
    1    2    3    4
    1
    2    4
    3    6    9
    4    8   12   16

Please enter the number of rows you would like to print: 2

Number of rows for this triangle: 2
    1    2
    1
    2    4
Would you like to continue? (Yes/No) Yes

Please enter the number of rows you would like to print: 7

Number of rows for this triangle: 7
    1    2    3    4    5    6    7
    1
    2    4
    3    6    9
    4    8   12   16
    5   10   15   20   25
    6   12   18   24   30   36
    7   14   21   28   35   42   49
Would you like to continue? (Yes/No) No

Thanks for using this program!
*/