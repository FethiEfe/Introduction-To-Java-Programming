package chapter05;
/*(Financial application: loan amortization schedule) The monthly payment for a
given loan pays the principal and the interest. The monthly interest is computed
by multiplying the monthly interest rate and the balance (the remaining principal).
The principal paid for the month is therefore the monthly payment minus
the monthly interest. Write a program that lets the user enter the loan amount,number of years, and interest rate and displays the amortization schedule for the
loan. Here is a sample run*/
import java.util.Scanner;

public class Exercise_5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Loan Amount:");
		double amount = input.nextDouble();
		System.out.println("Loan period in number of years");
		double year = input.nextDouble();
		System.out.println("Enter Annual Interest Rate");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		double MontlyPaymnet = (amount * monthlyInterestRate)
				/ (1 - (1 / (Math.pow(1 + monthlyInterestRate, year * 12))));
		double totalPayment = MontlyPaymnet * year * 12;
		System.out.printf("Monthly Payment: " + "%5.2f\n", MontlyPaymnet);
		System.out.printf("Total Payment: " + "%6.2f\n", totalPayment);
		double month = 1;
		System.out.println("Payment#          Interest          Principal          Balance");
		for (month = 1; month <= 12; month++) {

			
			double interest = amount * monthlyInterestRate;
			double principal = MontlyPaymnet - amount * monthlyInterestRate;
			double balance = amount - MontlyPaymnet;
			System.out.println(month + "\t\t" + interest
					+ "\t\t" + principal + "\t\t" + balance);
		}
	}

}
