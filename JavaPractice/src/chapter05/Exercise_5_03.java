 package chapter05;

/* Conversion from kilograms to pounds) Write a program that displays the following
table (note that 1 kilogram is 2.2 pounds):
Kilograms Pounds
1 2.2
3 6.6
...
197 433.4
199 437.8 */
public class Exercise_5_03 {
	public static void main(String[] args) {
		double kg = 2.2;
		int i = 0;
		System.out.println(" KG                  Pound");
		for (i = 1; i < 200; i += 2) {

			System.out.printf(i + "                   " + i * kg + "\n");
		}

	}
}
