/* 
 * Filename: USDRMBConversion.java
 * Author: nanonite9
 */

import java.util.Scanner;

public class USDRMBConversion {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = scan.nextDouble();

		System.out.print("\nEnter 0 to convert dollars to RMB and 1 vice versa: ");
		int input = scan.nextInt();

		if (input == 0) { // Convert RMB to USD
			System.out.print("Enter the dollar amount: ");
			double USD = scan.nextDouble();

			double RMB = (USD * rate);
			System.out.printf("$" + USD + " is %.1f yuan", RMB); // return 1 decimal place
		}
		
		else if (input == 1) { // Convert USD to RMB
			System.out.print("Enter the RMB amount:");
			double RMB = scan.nextDouble();

			double USD = (RMB/rate);
			System.out.printf(RMB + " yuan is $%.2f", USD); // return 2 decimal places
		}
		
		else {
			System.out.print("Invalid. Must enter 0 or 1."); // Prompts user to choose 0 or 1
		}
	}
}