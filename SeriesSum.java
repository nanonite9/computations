/* 
 * Filename: SeriesSum.java
 * Author: nanonite9
 * Date: October 6, 2017
 * Description: This program calculates the sum of the given series rounded to 2 decimal places.
 */

public class SeriesSum {
	public static void main(String[] args) {

		double sum = 0.0; // initializes sum to 0.0
		for (double n = 1.0; n <= 97.0; n += 2) { // initializes numerator to 2, creates boundary until 99, increments numerator by 2
			sum += n / (n + 2); // numerator is set to n, denominator is set to n + 2, sum is set to previous sum + numerator / denominator
		}

		System.out.println("Series:\n1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99"); // prints the given series
		System.out.printf("%26s%.2f", "The sum of the series is: ", sum); // prints sum of the series, rounded to 2 decimal places
	}
}