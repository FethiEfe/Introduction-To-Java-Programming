package chapter05;
/* (Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest
integer n such that n2 is greater than 12,000.*/
import java.util.Scanner;

public class Exercise_5_12 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter number");
	    int number = input.nextInt();
	    int n = 0;
	    while( n * n < number )
	    	n++;
	     System.out.println(n);
	    	
	    
		}

}
