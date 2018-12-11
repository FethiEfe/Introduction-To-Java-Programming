package chapter02;
import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seconds");
		int  seconds = input.nextInt() ;
		int min = seconds / 60 ;
		int sec = seconds % 60 ;
		System.out.println( seconds + " seconds are " + min + " minutes and " + sec + " seconds ");
		
		
		}
	}


