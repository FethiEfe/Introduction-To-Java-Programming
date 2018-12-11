package chapter03;
import java.util.Scanner;

public class ThreeFourteen {

	public static void main(String[] args) {
	int random = (int) (Math.random() * 2) ;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 0 for Head and 1 for Tail");
	int guess = input.nextInt();
	if(guess == random)
	System.out.println("Congrag!");
	else
		System.out.println("Wrong! it is ");
	System.out.println("It was " + random);
	}
	
}
