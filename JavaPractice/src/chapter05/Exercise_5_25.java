package chapter05;

import java.util.Scanner;

public class Exercise_5_25 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter integar for i");
	double n = input.nextDouble();
	double sum = 0;
	double i = 1;
	for( i = 1; i <= n; i++) {
	sum += Math.pow(-1, i+1) / ( 2 * i -1) ;
		
	}
	System.out.println(4 * sum);
	}

}
