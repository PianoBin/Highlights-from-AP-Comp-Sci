/**
 * Name: Delivery
 * @author Shoji Moto
 * @version 1.0
 * @since 11/25/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program reads from external file and finds the price based on dimensions and weight
 * 
 * Reinforced skill on methods
 * 
 */

import java.io.*;
import java.util.Scanner;

public class Delivery {
    public static double weightCheck(double weight) { //weightCheck method
        double wRate = 0;
        //find the price per pound, depending on weight
        if (weight <= 20) {
            wRate = 0.08;
        }
        else if (weight > 20 && weight <= 40) {
            wRate = 0.10;
        }
        else {
            wRate = 0.15;
        }
        
        return wRate;
    }
    
    public static double volumeCheck(double length, double width, double depth) { //volumeCheck method
        double vCharge = 0;
        if (length * width * depth > 18) {
            vCharge = 1; //extra $1 charge if volume greater than 18 cubic feet
        }
        
        return vCharge;
    }
    
    public static void main(String[] args) { //main method
        Scanner Package = null;
        try {
            Package = new Scanner(new File("prog213t.dat"));
        }
        catch (FileNotFoundException e){ //if file doesn't exist
            System.out.println("File not found.");
            System.exit(0);
        }
        //initialize vars
        int count = 1;
        double length = 0;
        double width = 0;
        double depth = 0;
        double weight = 0;
        
        double rate = 0.75;
        double wRate = 0;
        double wCharge = 0;
        double vCharge = 0;
        double total = 0;
        while (Package.hasNext()) {
            if (count % 4 == 3) { //length
                length = Package.nextDouble();
            }
            else if (count % 4 == 2) { //width
                width = Package.nextDouble();
            }
            else if (count % 4 == 1) { //depth
                depth = Package.nextDouble();
            }
            else if (count % 4 == 0) { //height
                weight = Package.nextDouble();
                
                wRate = weightCheck(weight); //find the price per pound
                wCharge = wRate * weight;
                
                vCharge = volumeCheck(length, width, depth); //find if there is a volume surcharge
                
                total = rate + wCharge + vCharge; //total price
                
                if (length > 3 || width > 3 || depth > 3 || weight > 50) { //Not Accepted
                    System.out.println("NATIONAL PARCEL SERVICE");
                    System.out.println("PACKAGE DATA");
                    System.out.println();
                    System.out.printf("%6s%9s%10s%10s", "LENGTH", "WIDTH", "DEPTH", "WEIGHT\n");
                    System.out.printf("%4.2f%10.2f%10.2f%9.2f", length, width, depth, weight);
                    System.out.println();
                    if (weight > 50) { //Because of Weight
                        System.out.println("Package Refused--Package Weight Exceeds 50 Pounds");
                    }
                    else { //Because of Dimensions
                        System.out.println("Package Refused--Package Dimensions Exceed 3 Feet");
                    }
                }
                else { //Accepted
                    System.out.println("NATIONAL PARCEL SERVICE");
                    System.out.println("PACKAGE DATA");
                    System.out.println();
                    System.out.printf("%6s%9s%10s%10s", "LENGTH", "WIDTH", "DEPTH", "WEIGHT\n");
                    System.out.printf("%4.2f%10.2f%10.2f%8.2f", length, width, depth, weight);
                    System.out.println();
                    System.out.println();
                    System.out.printf("%9s%13s%4.2f", "BASE RATE", "$", rate);
                    System.out.println();
                    System.out.printf("%8s%5.2f%9s%4.2f", "Weight @", wRate, "$", wCharge);
                    System.out.println();
                    System.out.printf("%16s%6s%4.2f", "Volume Surcharge", "$", vCharge);
                    System.out.println();
                    System.out.printf("%18s%4s%4.2f", "Total Due", "$", total);
                    System.out.println();
                }
                
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~");
                System.out.println();
            }
            count++;
        }
    }
}


/*
 * Output:
NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH    WIDTH     DEPTH   WEIGHT
0.80      1.20      1.50    6.00

BASE RATE            $0.75
Weight @ 0.08        $0.48
Volume Surcharge     $0.00
         Total Due   $1.23

~~~~~~~~~~~~~~~~~~~~

NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH    WIDTH     DEPTH   WEIGHT
2.30      2.70      3.00   25.60

BASE RATE            $0.75
Weight @ 0.10        $2.56
Volume Surcharge     $1.00
         Total Due   $4.31

~~~~~~~~~~~~~~~~~~~~

NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH    WIDTH     DEPTH   WEIGHT
4.40      1.00      2.40    55.80
Package Refused--Package Weight Exceeds 50 Pounds

~~~~~~~~~~~~~~~~~~~~

NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH    WIDTH     DEPTH   WEIGHT
2.60      2.60      2.60   40.50

BASE RATE            $0.75
Weight @ 0.15        $6.08
Volume Surcharge     $0.00
         Total Due   $6.83

~~~~~~~~~~~~~~~~~~~~

NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH    WIDTH     DEPTH   WEIGHT
2.00      2.00      2.00    63.20
Package Refused--Package Weight Exceeds 50 Pounds

~~~~~~~~~~~~~~~~~~~~

NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH    WIDTH     DEPTH   WEIGHT
3.50      3.50      3.50    21.70
Package Refused--Package Dimensions Exceed 3 Feet

~~~~~~~~~~~~~~~~~~~~
*/