package chapter02;
/*(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
a = (v1 - v0) /t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration. */
import java.util.Scanner;

public class Exercise_2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter V0, V1 and time ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double acceleration = (((v1 - v0) / t) * 100) / 100.0;
		System.out.println("Acceleration is " + acceleration);		
			}

}
