package chapter03;
import java.util.Scanner;

public class ThreeTwentyOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = input.nextInt();
		System.out.println("Enter Month");
		System.out.println("enter 13 for January and 14 for February");
		int month = input.nextInt();
		if(month == 1 || month== 2) {
			month = (month == 1) ? 13 : 14;
		year--;
		}
		System.out.println("Enter the day of the month:");
		int dayOfMonth = input.nextInt();
	
		int h = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100) 
				+ (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
		switch(h) {
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); 
		}
		
	
	}

}
