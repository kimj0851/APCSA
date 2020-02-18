//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joseph Kim
//Date - 2/10/20
//Class - p2
//Lab  - discount runner
package Unit_4;
import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.printf("Bill after discount :: " + "%.2f\n",Discount.getDiscountedBill(amt));
		System.out.println("Enter the original bill amount :: 2500");
		System.out.printf("Bill after discount :: " + "%.2f\n",Discount.getDiscountedBill(2500));
		System.out.println("Enter the original bill amount :: 4000");
		System.out.printf("Bill after discount :: " + "%.2f\n",Discount.getDiscountedBill(4000));
		System.out.println("Enter the original bill amount :: 333.333");
		System.out.printf("Bill after discount :: " + "%.2f\n",Discount.getDiscountedBill(333.333));
		System.out.println("Enter the original bill amount :: 95874.2154");
		System.out.printf("Bill after discount :: " + "%.2f\n", Discount.getDiscountedBill(95874.2154));
	}
}