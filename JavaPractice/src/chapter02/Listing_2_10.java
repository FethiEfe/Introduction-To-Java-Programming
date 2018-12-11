package chapter02;
/* compute change of given integer */
import java.util.Scanner;

public class Listing_2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of money");
		double AmountOfMoney = input.nextDouble();
		int Bill = (int) AmountOfMoney;
		System.out.println("Your bill is " + "$" + Bill);
		double RemainingMoney = AmountOfMoney * 100 % 100;
		double NumberOfQuarter = RemainingMoney / 25;
		System.out.println("Number of Quarters are " + (int) NumberOfQuarter);
		RemainingMoney = RemainingMoney % 25;
		int NumberOfDime = (int) RemainingMoney / 10;
		System.out.println("Number of Dimes are " + NumberOfDime);
		RemainingMoney = RemainingMoney % 10;
		int NumberofNicon = (int) RemainingMoney / 5;
		System.out.println("Number of Nicon is " + NumberofNicon);
		RemainingMoney = RemainingMoney % 5;
		int NumberofCent = (int) RemainingMoney / 1;
		System.out.println("Number of Cent " + NumberofCent);

	}

}
