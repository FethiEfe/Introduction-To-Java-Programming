package chapter05;

/* (Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.*/
import java.util.Scanner;

public class Exercise_5_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer");
		int number = input.nextInt();
		int i = 2;
		while (i <= number) {
			if (number % i == 0) {
				System.out.println(i);
				number = number / i;
			} else
				i++;

		}
	}
}
