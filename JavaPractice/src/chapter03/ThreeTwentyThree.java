package chapter03;
import java.util.Scanner;

public class ThreeTwentyThree {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value for x and y");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = 0;
	double y2 = 0;
	double HorizentalDistance = Math.sqrt(Math.pow(x1-x2, 2));
	double VerticalDistance = Math.sqrt(Math.pow(y1-y2, 2));
	if(HorizentalDistance <= 10 /2 && VerticalDistance <= 5/2) {
		System.out.println("In rectangle");
	}
	else
		System.out.println("not in rectangle");
}
}