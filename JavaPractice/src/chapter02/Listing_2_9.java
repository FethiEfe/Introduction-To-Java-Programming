package chapter02;
/* compute loan */
import java.util.Scanner;

public class Listing_2_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter Annual Interest Rate ");
		double AnnualInterestRate = input.nextDouble();
		double MonthlyInterestRate = AnnualInterestRate / 1200 ;
		
		System.out.println("Enter number of years");
		double years = input.nextDouble() ;
		
		System.out.println("Enter loan Amount ");
		double LoanAmount = input.nextDouble() ;
	
		double MonthlyPayment = (LoanAmount * MonthlyInterestRate) / (1-(1 / Math.pow(1 + MonthlyInterestRate, years * 12))) ;
		double TotalPayment = MonthlyPayment * years * 12 ;
		System.out.println("Montly Payment is " + (int)(MonthlyPayment *100) / 100.0 );
		System.out.println("Total Payments is " + (int)(TotalPayment * 100 ) / 100.0 );
	}

}

