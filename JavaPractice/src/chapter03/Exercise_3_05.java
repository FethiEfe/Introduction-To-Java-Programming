package chapter03;

/* (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week. */
import java.util.Scanner;

public class Exercise_3_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's date and future day");
		int day = input.nextInt();
		int number = input.nextInt();
		int FutureDate = (day + number) % 7;

		switch (FutureDate) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wenesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

	}

}
