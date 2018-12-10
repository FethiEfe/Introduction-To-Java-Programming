package chapter05;
/* (Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:
Kilograms Pounds | Pounds Kilograms
1 2.2 | 20 9.09
3 6.6 | 25 11.36
...
197 433.4 | 510 231.82
199 437.8 | 515 234.09 */
public class Exercise_5_05 {
	public static void main(String[] args) {
		System.out.printf("%-10s %8s    |     %-8s %10s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");

		int pounds = 20;
		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%-10d %8.1f    |     %-8d %10.2f%n", i, i * 2.2, pounds, pounds * 0.4545);
			pounds += 5;
		}
	}
}
