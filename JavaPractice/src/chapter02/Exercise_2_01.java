package chapter02;
/* (Convert Celsius to Fahrenheit)*/
import java.util.Scanner;

public class Exercise_2_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir Celcius degeri gir ");
		double Celcius = input.nextDouble();
		double Fahrenheit = (9.0 / 5) * Celcius + 32;
		System.out.println(Celcius + " Celcius is " + Fahrenheit + " Fahrenheit");

	}
}
