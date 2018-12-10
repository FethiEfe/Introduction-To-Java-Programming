package chapter05;
/* (Conversion from miles to kilometers) Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):
Miles Kilometers
1 1.609
2 3.218
...
9 14.481
10 16.090 */
public class Exercise_5_04 {
	public static void main(String[] args) {
		double Mile_Per_Km = 1.609;
		System.out.println("Miles               KM");
		for (double i = 1; i < 11; i++) {
			System.out.printf("%-20.0f%5.3f\n", i, (i * Mile_Per_Km));
		}
}
}