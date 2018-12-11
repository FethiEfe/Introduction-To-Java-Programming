package chapter02;
/* Compute the volume of a cylinder)*/
import java.util.Scanner;

public class Exercise_2_02 {
	public static void main(String[] args) {
		final double PI = 3.14 ;
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter Radius and Lenght of Cylinder ");
		double radius = input.nextDouble();
		double lenght = input.nextDouble();
		double area = radius * radius * PI ;
		double volume = area * lenght ;
		System.out.println("Area is " + area);
		System.out.println("Volume is " + volume);
		
		}

}
