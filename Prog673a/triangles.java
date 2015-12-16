/**
 * Name: triangles
 * @author Shoji Moto
 * @version 1.0
 * @since 12/16/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program creates triangles based on user choice
 * 
 * Reinforced skill on methods
 * 
 */

import java.io.*;
import java.util.Scanner;

public class triangles {
    public static void leftTriangle(int rows) { //method creates a left sided triangle
        int count = 0;
        int count2 = 0;
        
        while (count < rows) { //print correct number of rows
            while (count2 < count + 1) { //print one asterisk more than the current count number
                System.out.print("*");
                count2++;
            }
            
            System.out.println();
            count2 = 0;
            count++;
        }
    }
    
    public static void rightTriangle(int rows) { //program creates a right sided triangle
        int count = 0;
        int count2 = 0;
        
        while (count < rows) { //print correct number of rows
            while (count2 < rows - count - 1) { //print number of spaces depending on count - 1
                System.out.print(" ");
                count2++;
            }
            while (count2 < rows) { //fill extra spaces with asterisks
                System.out.print("*");
                count2++;
            }
            
            System.out.println();
            count2 = 0;
            count++;
        }
    }
    
    public static void centerTriangle(int rows) { //program creates a triangle with the top vertex in the middle
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        
        while (count < rows) { //print correct number of rows
            while (count2 < rows - (count + 1)) { //number of spaces
                System.out.print(" ");
                count2++;
            }
            while (count3 < count * 2 + 1) { //number of asterisks
                System.out.print("*");
                count3++;
            }
            
            System.out.println();
            count2 = 0;
            count3 = 0;
            count++;
        }
    }
    
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        
        System.out.println("Types of Triangles"); //menu
        System.out.println("\t 1. Left");
        System.out.println("\t 2. Right");
        System.out.println("\t 3. Center");
        System.out.print("Enter a number of Triangle Type (1-3): ");
        int theType = type.nextInt();
        System.out.println();
        
        System.out.print("How many rows?: ");
        int rows = type.nextInt();
        System.out.println();
        
        switch (theType) { //initiate method based on user's choice
            case 1:
            leftTriangle(rows);
            break;
            
            case 2:
            rightTriangle(rows);
            break;
            
            case 3:
            centerTriangle(rows);
            break;
        }
    }
}

/*
 * Output 1:
Types of Triangles
	 1. Left
	 2. Right
	 3. Center
Enter a number of Triangle Type (1-3): 1

How many rows?: 8

*
**
***
****
*****
******
*******
********
*/

/*
 * Output:
Types of Triangles
	 1. Left
	 2. Right
	 3. Center
Enter a number of Triangle Type (1-3): 2

How many rows?: 8

       *
      **
     ***
    ****
   *****
  ******
 *******
********
*/

/*
 * Output:
Types of Triangles
	 1. Left
	 2. Right
	 3. Center
Enter a number of Triangle Type (1-3): 3

How many rows?: 8

       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
*/