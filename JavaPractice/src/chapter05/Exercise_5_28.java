package chapter05;

import java.util.Scanner;

public class Exercise_5_28 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a year");
	int year = input.nextInt();
	System.out.println("Enter the first day of year for example 1 for sunday, 2 for monday etc.");
	int day = input.nextInt();
	
	boolean LeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ;
	
	System.out.println("January 1 of " +  year +  " is "  + day);
	System.out.println("February 1 of " +  year +  " is "  + (day+31)%7);
	day = (day+31)%7;
	if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	System.out.println("March 1 of " +  year +  " is "  + (day +29)%7);
	else
		System.out.println("March 1 of " +  year +  " is "  + (day +28)%7);	
	day = (day +(LeapYear?29:28)) % 7;
	System.out.println("April 1 of " +  year +  " is "  + (day + 31) % 7);
	day = (day + 31) % 7;
	System.out.println("May 1 of " +  year +  " is "  + (day + 30) % 7);
	day = (day + 30) % 7;
	System.out.println("June 1 of " +  year +  " is "  + (day + 31) % 7);
	day = (day + 31) % 7;
	System.out.println("July 1 of " +  year +  " is "  + (day + 30) % 7);
	day = (day + 30) % 7;
	System.out.println("August 1 of " +  year +  " is "  + (day + 31) % 7);
	day = (day + 31) % 7;
	System.out.println("september 1 of " +  year +  " is "  + (day + 31) % 7);
	day = (day + 31) % 7;
	System.out.println("october 1 of " +  year +  " is "  + (day + 30) % 7);
	day = (day + 30) % 7;
	System.out.println("november 1 of " +  year +  " is "  + (day + 31) % 7);
	day = (day + 31) % 7;
	System.out.println("december 1 of " +  year +  " is "  + (day + 30) % 7);
	day = (day + 310) % 7;
	switch(day) {
	case 1 : System.out.println("monday");
	}
	}
		
	
	}


