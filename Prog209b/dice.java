/*
 * Name: dice
 * @author: Shoji Moto
 * @version: 1.0
 * Date: 10/28/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses a while loop and if-else statements to determine the maximum area.
 * 
 * Reinforced skill on loops and if-else statements
 * 
 */

public class dice {
    public static void main(String[] args) {
        
        int dice1 = 1; //starting dice numbers, up to 6
        int dice2 = 1;
        int dice3 = 1;
        
        int nineCount = 0; //counting the number of instances for 9 and 10
        int tenCount = 0;
        
        int diceSum = 0; //sum of the three dice

        
        while (dice3 <= 6) { //Run loop while dice 3 is less than/equal to 6
                    
            diceSum = dice1 + dice2 + dice3; //find sum of dice
            if (diceSum == 9) { 
                nineCount++; //if sum equals 9, add 1 to this count
            }
            else if (diceSum == 10) {
                tenCount++; //if sum equals 10, add 1 to this count
            }
            
            if (dice3 != 6) { //if dice 3 doesn't equal 6 
                 dice3++; 
            }
            else if (dice3 == 6 && dice2 < 6) { //if dice 3 equals 6 and dice 2 does not equal 6
                dice2++;
                dice3 = 1;
            }
            else if (dice2 == 6 & dice1 < 6) { //if dice 2 equals 6 and dice 1 does not equal 6
                dice1++;
                dice2 = 1;
                dice3 = 1;
            }
            else if (dice1 == 6) { //if dice 1 equals 6, end this loop
                dice3 = 7;
            }
        }
        
        System.out.println("There are " + nineCount + " possible ways to get nine");
        System.out.println();
        System.out.println("There are " + tenCount + " possible ways to get ten");
    }
}

/*
 * Output:
There are 25 possible ways to get nine

There are 27 possible ways to get ten
*/