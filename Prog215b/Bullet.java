/*
 * Name: Bullet
 * @author: Shoji Moto
 * @version: 1.0
 * Date: 10/26/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses a while loop and if statement to determine the maximum point.
 * 
 * Reinforced skill on loops and if-statements
 * 
 */

public class Bullet {
    public static void main(String[] args){
        
        int seconds = 0; //Initial time
        int old_seconds = 0; //Saved value depending on height
        int height = 0; //Initializing height
        int old_height = 0; //Height checker
        
        while (seconds <= 60) { //Run loop until 60 seconds
            height = (960 * seconds) - (16 * (int)Math.pow(seconds, 2)); //Given formula
            
            if (height > old_height) { //Run if the new height is larger than the stored height
                old_height = height; //Change to the new max height
                old_seconds = seconds; //Change for the corresponding height
            } 
            
            seconds++; //increment by 1
        }
        
        System.out.println("The maximum height reached by the bullet is " + old_height + 
        " feet after " + old_seconds + " seconds.");
    }
}

/*
 * Output:
 * 
The maximum height reached by the bullet is 14400 feet after 30 seconds.
*/