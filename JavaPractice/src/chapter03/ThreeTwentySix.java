package chapter03;
import java.util.Scanner;

public class ThreeTwentySix {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter integer");
	int guess = input.nextInt();
	
	boolean x = (guess % 5 == 0 && guess % 6 == 0);
	System.out.println("Is 10 divisible by 5 and 6 ? " + x);
	boolean y = (guess % 5 == 0 || guess % 6 == 0);
	System.out.println("Is 10 divisible by 5 or 6 ? " + y);
	boolean z = (guess % 5 == 0 ^ guess % 6 == 0);
	System.out.println("Is 10 divisible by 5 or 6, but not both ? " + z);
}

}
