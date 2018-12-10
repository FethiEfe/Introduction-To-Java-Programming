package chapter05;
/* (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
subtraction questions. Revise the program to generate ten random addition questions
for two integers between 1 and 15. Display the correct count and test time. */

import java.util.Scanner;

public class Exercise_5_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfQuestion = 10;
		int count = 0;
		int correctCount = 0;
		String output = " " ;
		while(count < 10) {
			int Digit1 = (int)(Math.random() * 16);
			int Digit2 = (int)(Math.random() * 16);
			
			
				if (Digit1 < Digit2) {
				int	temp = Digit1;
				Digit1 = Digit2;
				Digit2 = Digit1;
		}
		System.out.println("What is " + Digit1 + " - " + Digit2 + "=?" );
		int answer = input.nextInt();
		if(Digit1 - Digit2 == answer) {
			System.out.println(Digit1 + "-" + Digit2 + "=" + answer + " is correct");
			correctCount++;
		}
		else  {
		System.out.println("Wrong" + Digit1 + "-" + Digit2 + "=" + (Digit1 - Digit2) );	
		count++;
		output += "\n" + Digit1 + "-" + Digit2 + "=" + answer +((Digit1 - Digit2 == answer) ? " correct" : " wrong");
		}
		
		}

		
		System.out.println("Correct Count " + correctCount);
		System.out.println("Output is  " + output);
		
		}
}
