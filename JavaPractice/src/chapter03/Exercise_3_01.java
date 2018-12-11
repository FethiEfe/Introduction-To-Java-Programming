package chapter03;
/* solve quadratic equations */
import java.util.Scanner;

public class Exercise_3_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter value for a, b, c ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double r1 = (-b + Math.sqrt(Math.pow(b, 2)- 4 * a * c)) / 2 * a;
		double r2 = (-b - Math.sqrt(Math.pow(b, 2)- 4 * a * c)) / 2 * a ;
		double disciriminant = Math.sqrt(Math.pow(b, 2)- 4 * a * c);
		
		if(disciriminant > 0)
			System.out.println("r1 and r2 are " + r1 + " , " + r2);
		else if (disciriminant == 0 )
			System.out.println("r1 is " + r1 );
		else
		System.out.println("The equation has no real roots");
		
		
		
		
	}

}

