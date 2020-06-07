/* 
 * Filename: Aliquot.java
 * Author: nanonite9
 * Date: October 6, 2017
 * Description: This program computes and prints the aliquot sum of an integer from user input.
 */

import java.util.Scanner;

public class Aliquot {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in); // implements scanner
        int aliquotSum = 0; // initializes sum to 0

    	System.out.println("Enter a number: "); // prompts user for a number
    	int n = scan.nextInt(); // stores user input in n
        
        for (int i = 1; i <= n/2; i++) // checks for factors of n, calculates aliquot sum of ith number
            if (n % i == 0) aliquotSum += i; // counting aliquot sum, if n <= 0, aliquotSum = 0 (arbitrary), if n == 1, aliquotSum = 0
        
        System.out.println("The Aliquot sum of " + n + " is " + aliquotSum); // prints aliquot sum
    }
}