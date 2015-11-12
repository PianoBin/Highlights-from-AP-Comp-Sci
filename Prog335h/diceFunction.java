/*
 * Name: diceFunction
 * @author: Shoji Moto
 * @version: 1.0
 * Date: 11/11/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses loops, switch, and if-else statements to categorize inputs
 * 
 * Reinforced skill on switch statements
 * 
 */

import java.io.*;
import java.util.Scanner;

public class diceFunction {
    public static void main(String[] args) {
        
        Scanner dice = new Scanner(System.in);
        
        //initializing vars
        int P = 0;
        int Q = 0;
        boolean pType = false;
        boolean qType = false;
        
        boolean badInput = false;
        
        int value = 0;
        
        String runAgain;
        
        do {
            System.out.print("Enter P: ");
            P = dice.nextInt(); //Input assigned as P
        
            System.out.print("\nEnter Q: ");
            Q = dice.nextInt(); //Input assigned as Q
            
            switch (P) { //BEGIN P switch block
                case 1:
                case 3:
                case 5:
                pType = false; //odd
                break;
                
                case 2:
                case 4:
                case 6:
                pType = true; //even
                break;
                
                default:
                badInput = true; //out of range
                break;
            } //END P switch block
            
            switch (Q) { //BEGIN Q switch block
                case 1:
                case 3:
                case 5:
                qType = false;
                break;
                
                case 2:
                case 4:
                case 6:
                qType = true;
                break;
                
                default:
                badInput = true;
                break;
            } //END Q switch block
            
            if (pType == true && qType == false) { //If P is even and Q is odd
                value = (2 * P) + Q;
            }
            else if (pType == false && qType == true) { //If P is odd and Q is even
                value = P + (2 * Q);
            }
            else { //If P and Q are both even or both odd
                if (P != Q) {
                    value = P + Q;
                }
                else {
                    value = 3 * Q;
                }
            }
            
            System.out.println("Value = " + value);
            
            System.out.print("Run this program again? (YES/NO): ");
            runAgain = dice.next();
            System.out.println();
        } while(runAgain.equalsIgnoreCase("YES"));
    }
}

/*
 * Output:
Enter P: 2

Enter Q: 5
Value = 9
Run this program again? (YES/NO): yes

Enter P: 4

Enter Q: 4
Value = 12
Run this program again? (YES/NO): yes

Enter P: 6

Enter Q: 2
Value = 8
Run this program again? (YES/NO): yes

Enter P: 1

Enter Q: 3
Value = 4
Run this program again? (YES/NO): yes

Enter P: 5

Enter Q: 5
Value = 15
Run this program again? (YES/NO): yes

Enter P: 1

Enter Q: 2
Value = 5
Run this program again? (YES/NO): no
*/