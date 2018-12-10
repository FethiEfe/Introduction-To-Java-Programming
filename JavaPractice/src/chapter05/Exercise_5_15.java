package chapter05;

/* (Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display ten characters per line. The ASCII
table is shown in Appendix B. Characters are separated by exactly one space. */
public class Exercise_5_15 {

	public static void main(String[] args) {
			
		for(char i = '!' ; i < '~' ; i++ ) {
			System.out.print((i%10 != 2)? i + " " : i + "\n");
		}
	}
}
