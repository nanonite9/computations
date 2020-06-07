/* 
 * Filename: SalesSalary.java
 * Author: nanonite9
 */
import java.util.Scanner;

public class SalesSalary {
	static final float PRODUCT_A = (float) 239.99; // Declare fixed values for products
	static final float PRODUCT_B = (float) 129.75;
	static final float PRODUCT_C = (float) 99.95;
	static final float PRODUCT_D = (float) 350.89;
	static final float FIXED_SALARY = (float) 200.00;

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Salesperson's salary calculation\nEnter units sold of Product A [integer]: "); // Enter units of each product
		int numA = scan.nextInt();

		System.out.println("Enter units sold of Product B [integer]: ");
		int numB = scan.nextInt();

		System.out.println("Enter units sold of Product C [integer]: ");
		int numC = scan.nextInt();

		System.out.println("Enter units sold of Product D [integer]: ");
		int numD = scan.nextInt();

		System.out.println("Enter provision rate in percent [integer]: ");
		int provisionRate = scan.nextInt();

		float totalSales = (PRODUCT_A * numA + PRODUCT_B * numB + PRODUCT_C * numC + PRODUCT_D * numD);
		float totalSalary = (FIXED_SALARY + (totalSales * provisionRate / 100));

		System.out.println("\nSalary slip\n"); // Print formatted salary slip

		System.out.printf("Product A: %d units * %-1s %10.2f %-3s%10.2f\n", numA, "$", PRODUCT_A, "= $", PRODUCT_A * numA);

		System.out.printf("Product B: %d units * %-1s %10.2f %-3s%10.2f\n", numB, "$", PRODUCT_B, "= $", PRODUCT_B * numB);

		System.out.printf("Product C: %d units * %-1s %10.2f %-3s%10.2f\n", numC, "$", PRODUCT_C, "= $", PRODUCT_C * numC);

		System.out.printf("Product D: %d units * %-1s %10.2f %-3s%10.2f\n", numD, "$", PRODUCT_D, "= $", PRODUCT_D * numD);

		System.out.printf("%49s", "-------------------\n");

		System.out.printf("%34s = $%10.2f\n\n", "Total sales", totalSales); // Align to the right
		
		System.out.printf("%-34s = $%10.2f\n", "Fixed part of salary", FIXED_SALARY); // Align to the left
		
		System.out.printf("Provision (%d%-22s = $%10.2f\n", provisionRate, "% of sales)", totalSalary - FIXED_SALARY);

		System.out.printf("%49s", "-------------------\n");

		System.out.printf("%34s = $%10.2f\n", "Total salary", totalSalary); // Align to the right
	}
}