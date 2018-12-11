package chapter01;
/* (Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
■ One birth every 7 seconds
■ One death every 13 seconds
■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated. For
example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
the fractional part, one of the values involved in the division must be a number with a
decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5. */
public class Exercise_1_11 {
	public static void main(String[] args) {
		int CurrentPopulation = 312032486;
		int SecondsInYear = 365 * 24 * 60 * 60;
		int BirthInYear = SecondsInYear / 7;
		int DeathInYear = SecondsInYear / 13;
		int Immigration = SecondsInYear / 45;
		int Population2018 = CurrentPopulation + BirthInYear + Immigration - DeathInYear;
		int Population2019 = Population2018 + BirthInYear + Immigration - DeathInYear;
		int Population2020 = Population2019 + BirthInYear + Immigration - DeathInYear;
		int Population2021 = Population2020 + BirthInYear + Immigration - DeathInYear;
		int Population2022 = Population2021 + BirthInYear + Immigration - DeathInYear;
		System.out.println(Population2018);
		System.out.println(Population2019);
		System.out.println(Population2020);
		System.out.println(Population2021);
		System.out.println(Population2022);
		System.out.println(BirthInYear);

	}

}
