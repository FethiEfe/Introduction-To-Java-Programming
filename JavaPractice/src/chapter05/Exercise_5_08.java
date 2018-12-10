package chapter05;
/*(Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score. */
import java.util.Scanner;

public class Exercise_5_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Student");
		int numberOfStudent = input.nextInt() ;
		int count = 1;
		int highScore = 0;
		String highestScoreName = " ";
		String SecondHighScoreName  = " ";
		  
		for(count=1;count<= numberOfStudent; count++) {
			System.out.println("enter " + count + ". student 's name and score" );
			String name = input.next();
			int score = input.nextInt();
			if(score>highScore) {
				highScore = score;
				highestScoreName = name;
			}
				
			}
		System.out.println(highestScoreName + "\t" +  highScore);
		
		}

	}


