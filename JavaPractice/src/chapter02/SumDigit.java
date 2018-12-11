package chapter02;
import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int number = input.nextInt();
		int digit1 = number % 10 ;
		number /= 10 ;
		int digit2 = number % 10 ;
		int digit3 = number / 10 ;
		System.out.println(digit1 + digit2 + digit3);
 	}

}
