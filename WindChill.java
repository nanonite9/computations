/* 
 * Filename: WindChill.java
 * Author: nanonite9
 */

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Wind chill calculator");

		System.out.println("Enter the temperature [float] = ");
		float t = scan.nextFloat();

		System.out.println("Enter the wind speed [float] = ");
		float v = scan.nextFloat();

		float w = (35.74f + 0.6125f*t + (float)(0.4275*t - 35.75) * (float)Math.pow(v, 0.16));

		System.out.printf("Wind chill = %-10.3f", w);
	}
}