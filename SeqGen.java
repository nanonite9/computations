/* 
 * Filename: SeqGen.java
 * Author: nanonite9
 * Date: October 6, 2017
 * Description: This program asks a user for a positive integer less than or equal to 100, performs a range check, computes and outputs the sequence until the last element precedes 1.
 */
import java.util.Scanner;

public class SeqGen {
	static final int max = 100;

	static final int computeNextNum(int num) { // computes the next number in sequence according to given formulas
		int nextNum;
		
		if (num % 2 == 1) {
			nextNum = num * 6 + 2;
		}
		
		else {
			nextNum = num / 2;
		}
		return nextNum;
	}

	static final void bordered(int num, int i) { // adds borders of [] or () for the numbers, int i is the index to be printed at
		
		if (num % 2 == 1) { // border decided according to given formulas
			System.out.print("(" + num + ") "); // odd
		}
		
		else {
			System.out.print("[" + num + "] "); // even
		}
		
		if (i % 20 == 0) { // last line must contain less than 20 elements
			System.out.println();
		}
	}
	
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to The Sequence Generator\n---------------------------------");
		
		int indexToPrint = 1;
		int input; // initializes user input and element
		int num;
		
		System.out.print("Please Enter a positive integer no more than 100: ");
		input = scan.nextInt();
		
		if (input > 1 && input <= max) { // ensures integer is positive and no more than 100
			num = input;
			while (num != 1) { // if passed, num is used as first element of the sequence, that precedes the element 1
				bordered(num, indexToPrint); // wraps the numbers according to method above
				indexToPrint++;
				num = computeNextNum(num);
			}
			
		System.out.println();	
		}
		else { // print message if input is invalid
			System.out.println("Invalid. Integer must be positive and no more than 100. Try again.");
		}
	}
}