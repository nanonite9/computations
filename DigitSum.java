/* 
 * Filename: DigitSum.java
 * Author: nanonite9
 */

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number betwen 0 and 1000: ");
		int num = scan.nextInt(); // takes user input

		int ones = num % 10; // extracts ones digit
		num /= 10; // remaining digits

		int tens = num % 10; // extracts tens digit
		num /= 10;

		int hundreds = num % 10; // extracts hundreds digit
		num /=10;

		int sum = (ones + tens + hundreds);

		System.out.printf("\nThe sum of the digits is " + sum);
	}
}