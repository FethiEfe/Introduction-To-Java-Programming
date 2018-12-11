package chapter05;
import java.util.Scanner;
/* finding future tuition */
public class FutureTuition {
public static void main(String [] args) {
	System.out.println("The First Year's Tuition is $10000");
	int year = 0;
	int tuition = 10_000;
	while(tuition < 20_000) {
		tuition *= 1.07;
		year++;
	}
	System.out.println(year);		
	
	
	}
 }
