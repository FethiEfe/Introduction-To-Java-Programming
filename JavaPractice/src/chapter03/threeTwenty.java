package chapter03;
import java.util.Scanner;

public class threeTwenty {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter tempeture btw -58F and 41F");
	double temperature = input.nextDouble();
	System.out.println("Enter Wind speed greater or equal to 2 mph");
	double wind = input.nextDouble();
	double windChill = -1;
	if ( temperature <= -58 || temperature >= 41 || wind<2) { 
			System.out.println("Temperature or wind  is not in the rage bwt given values");
		System.exit(1);
	}
	windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(wind, 0.16)) + (0.4275 * temperature * Math.pow(wind, 0.16));
	System.out.println(windChill);
	
	}

}
