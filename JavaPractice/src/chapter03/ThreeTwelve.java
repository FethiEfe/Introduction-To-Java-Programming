package chapter03;
import java.util.Scanner;

public class ThreeTwelve {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three digits");
		int ThreeDigits = input.nextInt();
		int FirstDigit = ThreeDigits % 10;
		int ThirdDigit = ThreeDigits / 100;
		System.out.println(ThreeDigits + ((FirstDigit == ThirdDigit) ? " is a palindrome" : " is not a palindrome"));

	}
}
