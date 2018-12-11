package chapter03;
import java.util.Scanner;

public class ThreeEighteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Weight of Box");
		double weight = input.nextDouble();
		if (0 < weight && weight <= 1 ) 
		System.out.println(" Shipping cost is $" + (weight * 3.5));
		else if (1 < weight && weight <= 3)
		System.out.println(" Shipping cost is $" + (weight * 5.5) );
		else if (3 < weight && weight  <= 10)
		System.out.println(" Shipping cost is"   + (weight * 8.5) );
		else if (10 < weight && weight <= 20)
		System.out.println(" Shipping cost is $" + (weight * 10.5) );
		else
			System.out.println("Package is too heavy to ship out");
	}

}
