package chapter03;
/*Suppose you want to develop a program to play lottery. The program randomly generates a
lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000*/
import java.util.Scanner;

public class Listing_3_18 {
	public static void main(String[] args) {
		int lottery = (int) (Math.random() * 100);
		Scanner input = new Scanner(System.in);
		System.out.println("enter your guess");
		int guess = input.nextInt();
		System.out.println("lottery digits " + lottery);
		int guessDigit1 = guess % 10;
		int guessDigit2 = guess / 10;
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = lottery / 10;

		if (lottery == guess)
			System.out.println(" You win $10_000");
		else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
			System.out.println("$3000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else {
			System.out.println("no money");
		}
		
		

	}
}
