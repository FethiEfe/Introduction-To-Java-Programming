package chapter03;
/* (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers. */
import java.util.Scanner;

public class Exercise_3_02 {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 9);
		int number2 = (int) (Math.random() * 9);
		int number3 = (int) (Math.random() * 9);
		Scanner input = new Scanner(System.in);
		System.out.println(number1 + "+" + number2 + "+" + number3 + "= ?");
		int answer = number1 + number2 + number3;
		System.out.println("Enter your answer");
		double guess = input.nextDouble();

		if (answer == guess)
			System.out.println("Cong! you are right");
		else
			System.out.println("Wrong. Answer is " + answer);

	}

}
