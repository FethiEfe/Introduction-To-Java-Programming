package chapter02;
import java.util.Scanner;
/* (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. */
public class QuestionTwoSeven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int second = input.nextInt();
		int secondsInYear = 365 * 24 * 60 *60 ;
		int year = second / secondsInYear ;
		int remaining = second % secondsInYear ;
		int secondsInDay = 24 * 60 * 60;
		int day = remaining / secondsInDay ;
		System.out.println("year: " + year + " day: " + day);
		
	
	}
}
