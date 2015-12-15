/**
 * Name: time
 * @author Shoji Moto
 * @version 1.0
 * @since 12/15/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program does several time conversions depending on user preference
 * 
 * Reinforced skill on methods
 * 
 */

import java.io.*;
import java.util.Scanner;

public class time {
    public static void hoursToMin() { //Method converts hours to minutes
        System.out.println("Hours to Minutes Conversion\n");
        int ans = 0;
        
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter number of hours: ");
        int hour1 = convert.nextInt();
        
        ans = (hour1 * 60);
        System.out.println(hour1 + " hour(s) converts to " + ans + " minutes.");
    }

    public static void daysToHours() { //method converts days to hours
        System.out.println("Days to Hours Conversion\n");
        int ans = 0;
        
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days1 = convert.nextInt();
        
        ans = days1 * 24;
        System.out.println(days1 + " day(s) converts to " + ans + " hours.");
    }    
    
    public static void minToHours() { //method converts minutes to hours
        System.out.println("Minutes to Hours Conversion\n");
        int ans = 0;
        
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int mins1 = convert.nextInt();
        
        ans = (mins1 / 60);
        int ans2 = (ans * 60) - mins1;
        if (ans2 < 0) { //for extra minutes
            ans2 = ans2 * (-1);
        }
        System.out.println(mins1 + " minute(s) converts to " + ans + " hour(s) and " + ans2 + " minute(s).");
    }    

    public static void hoursToDays() { //method converts hours to days
        System.out.println("Hours to Days Conversion\n");
        int ans = 0;
        
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        int hours1 = convert.nextInt();
        
        ans = (hours1 / 24);
        int ans2 = (ans * 24) - hours1;
        if (ans2 < 0) { //for extra hours
            ans2 = ans2 * (-1);
        }
        
        System.out.println(hours1 + " hour(s) converts to " + ans + " day(s) and " + ans2 + " hour(s).");
    }    

    public static void elapse() { //method find the time elapsed
        System.out.println("Elapsed Time Conversion\n");
        
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter the beginning hour: ");
        int hour1 = convert.nextInt();
        System.out.println("Enter the beginning minutes: ");
        int min1 = convert.nextInt();
        convert.nextLine();
        System.out.println("Enter am/pm: ");
        String apm = new String(convert.nextLine());
        
        System.out.println("Enter the ending hour: ");
        int hour2 = convert.nextInt();
        System.out.println("Enter the ending minutes: ");
        int min2 = convert.nextInt();
        convert.nextLine();
        System.out.println("Enter am/pm: ");
        String apm2 = new String(convert.nextLine());
        
        if (apm.equalsIgnoreCase("pm")) {
            hour1 = hour1 + 12; //military time
        }
        
        if (apm2.equalsIgnoreCase("pm")) {
            hour2 = hour2 + 12; //military time
        }
        
        int hourChange = hour2 - hour1;
        if (hourChange < 0) {
            hourChange = (24 - hour1) + hour2; //if clock passes midnight, reset
        }
        int minChange = min2 - min1;
        if (minChange < 0) {
            hourChange = hourChange - 1; 
            minChange = minChange * (-1);
        }
        System.out.println("The elapsed time is: " + hourChange + " hrs " + minChange + " min");
    }    
    
    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);
        System.out.println("Conversion Tasks"); //menu
        System.out.println("    1. hours -> minutes");
        System.out.println("    2. days -> hours");
        System.out.println("    3. minutes -> hours");
        System.out.println("    4. hours -> days");
        System.out.println("    5. elapsed time between two times");
        System.out.println("Enter a number: ");
        int option = convert.nextInt();
        
        System.out.println();
        
        switch (option) { //switch block for menu choice
            case 1:
            hoursToMin(); 
            break;
            case 2:
            daysToHours();
            break;
            case 3:
            minToHours();
            break;
            case 4:
            hoursToDays();
            break;
            case 5:
            elapse();
            break;
        }
    }
}

/*
Output:

Conversion Tasks
    1. hours -> minutes
    2. days -> hours
    3. minutes -> hours
    4. hours -> days
    5. elapsed time between two times
Enter a number: 
1

Hours to Minutes Conversion

Enter number of hours: 
3
3 hour(s) converts to 180 minutes.
*/

/*
Output:

Conversion Tasks
    1. hours -> minutes
    2. days -> hours
    3. minutes -> hours
    4. hours -> days
    5. elapsed time between two times
Enter a number: 
2

Days to Hours Conversion

Enter the number of days: 
4
4 day(s) converts to 96 hours.
*/

/*
Output:

Conversion Tasks
    1. hours -> minutes
    2. days -> hours
    3. minutes -> hours
    4. hours -> days
    5. elapsed time between two times
Enter a number: 
3

Minutes to Hours Conversion

Enter the number of minutes: 
231
231 minute(s) converts to 3 hour(s) and 51 minute(s).
*/

/*
Output:

Conversion Tasks
    1. hours -> minutes
    2. days -> hours
    3. minutes -> hours
    4. hours -> days
    5. elapsed time between two times
Enter a number: 
4

Hours to Days Conversion

Enter the number of hours: 
940
940 hour(s) converts to 39 day(s) and 4 hour(s).
*/

/*
Output:

Conversion Tasks
    1. hours -> minutes
    2. days -> hours
    3. minutes -> hours
    4. hours -> days
    5. elapsed time between two times
Enter a number: 
5

Elapsed Time Conversion

Enter the beginning hour: 
8
Enter the beginning minutes: 
14
Enter am/pm: 
am
Enter the ending hour: 
2
Enter the ending minutes: 
47
Enter am/pm: 
pm
The elapsed time is: 6 hrs 33 min
*/

/*
Output:

Conversion Tasks
    1. hours -> minutes
    2. days -> hours
    3. minutes -> hours
    4. hours -> days
    5. elapsed time between two times
Enter a number: 
5

Elapsed Time Conversion

Enter the beginning hour: 
4
Enter the beginning minutes: 
30
Enter am/pm: 
am
Enter the ending hour: 
1
Enter the ending minutes: 
0
Enter am/pm: 
pm
The elapsed time is: 8 hrs 30 min
*/

/*
Output:

Conversion Tasks
    1. hours -> minutes
    2. days -> hours
    3. minutes -> hours
    4. hours -> days
    5. elapsed time between two times
Enter a number: 
5

Elapsed Time Conversion

Enter the beginning hour: 
9
Enter the beginning minutes: 
20
Enter am/pm: 
pm
Enter the ending hour: 
11
Enter the ending minutes: 
30
Enter am/pm: 
pm
The elapsed time is: 2 hrs 10 min
*/