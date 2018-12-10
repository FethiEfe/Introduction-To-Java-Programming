package chapter05;
/* (Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8.*/
import java.util.Scanner;

public class Exercise_5_21 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Loan Amount:");
	double amount = input.nextDouble();
	System.out.println("Loan period in number of years");
	double year = input.nextDouble();
	double annualInterestRate = 5.0;
	
	System.out.println("Interest Rate        "  + "Monthly Payment     "  + "Total Payment");
	while(  annualInterestRate <= 8.0) {
		double monthlyInterestRate = annualInterestRate/1200;
		double MontlyPaymnet = (amount * monthlyInterestRate) / (1- (1/(Math.pow(1 + monthlyInterestRate, year * 12))));
		double totalPayment = MontlyPaymnet * year * 12 ;
		System.out.printf("%-20.3f%-20.2f%-20.2f\n",annualInterestRate, MontlyPaymnet,totalPayment);
		annualInterestRate += 0.125;
		
	}
	}

}
