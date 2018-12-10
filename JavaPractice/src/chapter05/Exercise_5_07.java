package chapter05;
 /* (Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year. */
public class Exercise_5_07 {
	public static void main(String[] args) {
		double i = 10_000;
		double Cost = 0;
		int year = 1;
		for(year = 1;  year <15; year++) {
		
		 i *= 1.05;
		 if (year<11)
		 System.out.printf(year + ". year's tuition is $" + "%5.2f\n",i);
		 else {
			 Cost += i;
			 
		 }
			
		}
		System.out.printf("%5.2f",Cost);
		}
}
