/*
 * Name: egg
 * @author: Shoji Moto
 * @version: 1.0
 * Date: 10/28/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses a while loop and if statement with conditional operators to find the number
 * 
 * Reinforced skill on conditional operators
 * 
 */

public class egg {
    public static void main(String[] args) {
        
        int mystery_num = 1; //starting number
        
        int count2 = 0; //initializing multiple checkers
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 1;
        
        while (count2 != 1 || count3 != 2 || count4 != 3 || count5 != 4 || count6 != 5 || count7 != 0) {
            
            count2 = mystery_num % 2; //find the remainder of each operation
            count3 = mystery_num % 3;
            count4 = mystery_num % 4;
            count5 = mystery_num % 5;
            count6 = mystery_num % 6;
            count7 = mystery_num % 7;
            
            if (count2 != 1 || count3 != 2 || count4 != 3 || count5 != 4 || count6 != 5 || count7 != 0) {
                mystery_num++; //if and only if one of the above is true, increment the mystery number
            }
        } 
 
        System.out.println("The basket contains " + mystery_num + " eggs.");
    }
}

/*
 * Output:
 * 
The basket contains 119 eggs.
*/