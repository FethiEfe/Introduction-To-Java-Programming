package chapter05;
/* (Sum a series) Write a program to sum the following series */

public class Exercise_5_24 {

	public static void main(String[] args) {
	double x = 1;
	double y = 3;
	double sum = 0 ;
	while(x < 98 && y < 99) {
		sum += x / y ;
		x = x+2;
		y = y+2;
	}
	System.out.println(sum);
	}

}
