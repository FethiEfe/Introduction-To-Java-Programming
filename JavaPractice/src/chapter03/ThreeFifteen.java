package chapter03;
import java.util.Scanner;

public class ThreeFifteen {

	public static void main(String[] args) {
	int lottery =  (int)(100+ Math.random() * 900);
	int number1 = lottery / 100;
	int number2 = (lottery % 100) / 10;
	int number3 = (lottery % 100) % 10;
	Scanner input = new Scanner(System.in);
	System.out.println("enter your 3 digits guess");
	int guess = input.nextInt();
	int guess1 = guess / 100;
	int guess2 = (guess % 100) / 10;
	int guess3 = (guess % 100) % 10;
	System.out.println("lottery number is " + lottery);
	
	if (lottery == guess)
		System.out.println("Congs! You won $10,000");
	 else if ((guess1 == number2 && guess2 == number1 && guess3 == number3)
			    || (guess1 == number2
			      && guess1 == number3 && guess3 == number1)
			    || (guess1 == number3
			      && guess2 == number1 && guess3 == number2)
			    || (guess1 == number3
			      && guess2 == number2 && guess3 == number1)
			    || (guess1 == number1
			      && guess2 == number3 && guess3 == number2))
			   System.out.println("Match all digits: you win $3,000");
			  else if (guess1 == number1 || guess1 == number2
			    || guess1 == number3 || guess2 == number1
			    || guess2 == number2 || guess2 == number3
			    || guess3 == number1 || guess3 == number2
			    || guess3 == number3)
			   System.out.println("Match one digit: you win $1,000");
			  else
			   System.out.println("Sorry, no match");
	}

}
