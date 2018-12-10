package chapter05;
/*(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number.
*/

import java.util.Scanner;

public class Exercise_5_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0:");
		int negativeCount = 0;
		int positiveCount = 0;
		int sum = 0;
		while (true) {
			int i = input.nextInt();
			sum += i;
			if (i > 0) {
				positiveCount++;
			} else if (i < 0) {
				negativeCount++;
			}

			System.out.println(sum);
			if (i == 0)
				break;
		}
		System.out.println("sum" + sum);
		System.out.println("number of negative " + negativeCount);
		System.out.println("Number of pozitive " + positiveCount);
		System.out.println("Average " + (double) sum / (negativeCount + positiveCount));
	}

}
