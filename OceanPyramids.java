/* 
 * Filename: OceanPyramids.java
 * Author: nanonite9
 * Date: October 6, 2017
 * Description: This program prompts the user to enter an integer between 1 to 15 and displays a pyramid.
 */

import java.util.Scanner;

public class OceanPyramids {
    public static void main(String[] strings) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of lines: "); // prompts user for number between 1 and 15
        int n = scan.nextInt();

        while (n < 1 || n > 15) {
            System.out.println("Invalid. Please choose a number between 1 and 15."); // prompts user for number between 1 and 15
            n = scan.nextInt();
        }

        for (int i = 1; i <= n; i++) { // creates left spacing, unique to each row
            for (int j = 1; j <= n - i; j++) {
                System.out.printf("%3s", " "); // aligned spacing
            }

            for (int num = i; num >= 1; num--) { // creates left side of pyramid starting with num and decreasing by 1
                System.out.printf("%3d", num); // aligned numbers
            }

            for (int num = 2; num <= i; num++) { // creates right side of pyramid starting with num and increasing by 1
                System.out.printf("%3d", num); // aligned numbers
            } 
            
            System.out.println(); // prints each loop on new line
        }
    }
}
