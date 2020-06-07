/* 
 * Filename: DragonCurve2.java
 * Author: nanonite9
 * Date: October 6, 2017
 * Description: This program writes the instructions for drawing a dragon curve of a string of order n.
 */

import java.util.Scanner;

public class DragonCurve2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: "); // Prompts user to enter String of F, L or R
        String x = scan.nextLine();
        
        String dragon = x; // initializes dragon, bw (string backwards), and prev (previous order value)
        String bw = x;
        String prev;
        
        System.out.println("Enter number of iterations: "); // Prompts user to enter int value of iterations
        int iterations = scan.nextInt();
        
        System.out.println("The iterations are: ");

    for (int i = 0; i < iterations; i++) { // order 0 through specified order user entered
        prev = dragon; // to save previous input
        
        while (i == 0) { // print order 0
            System.out.println("The first iteration is: " + dragon);
            break;
        }
        
        dragon += "L" + bw;
        bw = prev + "R" + bw; // repeat previous input
        
        // prints up to order 10
        while (i == 1) { // print order 1
            System.out.println("The second iteration is: " + dragon);
            break;
        }
        
        while (i == 2) { // print order 2
            System.out.println("The third iteration is: " + dragon);
            break;
        }
        
        while (i == 3) { // print order 3
            System.out.println("The fourth iteration is: " + dragon);
            break;
        }
        
        while (i == 4) { // print order 4
            System.out.println("The fifth iteration is: " + dragon);
            break;
        }
        
        while (i == 5) { // print order 5
            System.out.println("The sixth iteration is: " + dragon);
            break;
        }
        
        while (i == 6) { // print order 6
            System.out.println("The seventh iteration is: " + dragon);
            break;
        }
        
        while (i == 7) { // print order 7
            System.out.println("The eighth iteration is: " + dragon);
            break;
        }
        
        while (i == 8) { // print order 8
            System.out.println("The nineth iteration is: " + dragon);
            break;
        }
        
        while (i == 9) { // print order 9
            System.out.println("The tenth iteration is: " + dragon);
            break;
        }
        
        while (i == 10) { // print order 10
            System.out.println("The eleventh iteration is: " + dragon);
            break;
        }
    }
    }
}