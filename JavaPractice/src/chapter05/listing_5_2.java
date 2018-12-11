package chapter05;

import java.util.Scanner;

public class listing_5_2 {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != number) {
			System.out.println("\nEnter your guess");
			guess = input.nextInt();
			if (guess == number)
				System.out.println("you are correct");
			else if (guess > number)
				System.out.println("too high");
			else
				System.out.println("too low");
		}

	}

}
