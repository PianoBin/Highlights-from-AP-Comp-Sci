/*
 * Name: funcTable
 * @author: Shoji Moto
 * @version: 1.0
 * Date: 10/1/15
 * 
 * Compiler: BlueJ
 * Platform: Windows 8
 * 
 * Description: Program uses a for loop to manipulate numbers
 * 
 * Learned how to use printf to format the output/
 */

public class funcTable {
    public static void main(String[] args) {
        
        System.out.printf("%-8s %-8s %-13s %-8s %-8s", "Number", "Square", "Square Root",
        "Cube", "4th Root"); //Header
        System.out.println();
        
        for (int num = 1; num <= 20; num++){ //BEGIN num loop
            int square = (int)Math.pow(num, 2); //finds square of num
            double root = Math.round(Math.sqrt(num) * 10000.0) / 10000.0; //Square root of num
            int cube = (int)Math.pow(num, 3); //Cube of number
            double fourth = Math.round(Math.sqrt(root) * 10000.0) / 10000.0; /*Fourth root, square 
            root of root*/
            
            System.out.printf("%6d", num); //everything prints on one line, formatted
            System.out.printf("%9d", square);
            System.out.printf("%14.4f", root);
            System.out.printf("%7d", cube);
            System.out.printf("%13.4f", fourth);
            System.out.println();
        } //END num loop
    }
}

/*
 *Output:
 *
Number   Square   Square Root   Cube     4th Root
     1        1        1.0000      1       1.0000
     2        4        1.4142      8       1.1892
     3        9        1.7321     27       1.3161
     4       16        2.0000     64       1.4142
     5       25        2.2361    125       1.4954
     6       36        2.4495    216       1.5651
     7       49        2.6458    343       1.6266
     8       64        2.8284    512       1.6818
     9       81        3.0000    729       1.7321
    10      100        3.1623   1000       1.7783
    11      121        3.3166   1331       1.8212
    12      144        3.4641   1728       1.8612
    13      169        3.6056   2197       1.8988
    14      196        3.7417   2744       1.9343
    15      225        3.8730   3375       1.9680
    16      256        4.0000   4096       2.0000
    17      289        4.1231   4913       2.0305
    18      324        4.2426   5832       2.0598
    19      361        4.3589   6859       2.0878
    20      400        4.4721   8000       2.1147
*/
