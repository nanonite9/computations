/* 
 * Filename: CubeVolume.java
 * Author: nanonite9
 */

import java.util.Scanner;

public class CubeVolume {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Volume of a cube calculator");

		System.out.println("Enter the length [float]: "); // Prompts user to enter values
		float lengthOfTheCube = scan.nextFloat();

		System.out.println("Enter the width  [float]: ");
		float widthOfTheCube = scan.nextFloat();

		System.out.println("Enter the height [float]: ");
		float heightOfTheCube = scan.nextFloat();

		float volumeOfTheCube = (lengthOfTheCube * widthOfTheCube * heightOfTheCube); // formula of a cube

		System.out.printf("%13s%-10.3f", "The volume is ", volumeOfTheCube); // formatted strings to 13 characters, formatted values to 2 decimal points, left-indented

	}
}