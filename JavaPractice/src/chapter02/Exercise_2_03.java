package chapter02;

/* Convert feet into meters */
import java.util.Scanner;

public class Exercise_2_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Feet value");
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		System.out.println(feet + " feet is " + meter + " Meters");
	}

}
