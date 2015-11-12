/**
 * Name: Weather
 * @author Shoji Moto
 * @version 1.0
 * @since 11/12/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses switch statement and if/else to organize input data
 * 
 * Reinforced skill on switch statements
 * 
 */

import java.io.*;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        
        Scanner Forecast = new Scanner(System.in);
        
        System.out.print("Enter Cricket Chirps/Min: ");
        int cricket = Forecast.nextInt(); //number of cricket chirps per min
        
        double fTemp = Math.round(((cricket + 40) / 4) * 10.0) / 10.0; //to nearest tenth
        System.out.println("Fahrenheit = " + fTemp);
        
        double cTemp = Math.round((5.0 / 9.0) * (fTemp - 32) * 10.0) / 10.0; //to nearest tenth
        System.out.println("Centigrade = " +  cTemp);
        
        int TempCase = 0; //initialize case var
        
        //categorize depend on Fahrenheit temp
        if (fTemp < 45) {
            TempCase = 1;
        }
        else if (fTemp >= 45 && fTemp <= 64) {
            TempCase = 2;
        }
        else if (fTemp >= 65 && fTemp <= 80) {
            TempCase = 3;
        }
        else if (fTemp >= 81 && fTemp <= 108) {
            TempCase = 4;
        }
        else {
            TempCase = 5;
        }
        
        //Display appropriate output
        switch (TempCase) {
            case 1:
            System.out.println("Condition = Bur-rr");
            break;
            
            case 2:
            System.out.println("Condition = Take a Jacket");
            break;
            
            case 3:
            System.out.println("Condition = Ah-hhh");
            break;
            
            case 4:
            System.out.println("Condition = Whew");
            break;
            
            default:
            System.out.println("Condition = Dead Cricket");
            break;
        }
        
    }
}

/*
 * 
Output:
Enter Cricket Chirps/Min: 20
Fahrenheit = 15.0
Centigrade = -9.4
Condition = Bur-rr


Enter Cricket Chirps/Min: 180
Fahrenheit = 55.0
Centigrade = 12.8
Condition = Take a Jacket


Enter Cricket Chirps/Min: 240
Fahrenheit = 70.0
Centigrade = 21.1
Condition = Ah-hhh


Enter Cricket Chirps/Min: 480
Fahrenheit = 130.0
Centigrade = 54.4
Condition = Dead Cricket
*/