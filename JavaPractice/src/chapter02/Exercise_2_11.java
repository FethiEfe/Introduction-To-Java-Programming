package chapter02;
/* (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer. */
import java.util.Scanner;

public class Exercise_2_11 {
	public static void main(String[] args) {
		int CurrentPopulation = 312_032_486;
		int RiseInPopulationEveryYear = 1000;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year");
		int year = input.nextInt();
		int population = CurrentPopulation + RiseInPopulationEveryYear * year;
		System.out.println(population);

	}

}
