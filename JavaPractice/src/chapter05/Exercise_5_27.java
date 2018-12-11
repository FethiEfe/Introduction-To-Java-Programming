package chapter05;

public class Exercise_5_27 {

	public static void main(String[] args) {

		for (int i = 101; i <= 2100; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				;
			System.out.print(i);
		}
	}
}