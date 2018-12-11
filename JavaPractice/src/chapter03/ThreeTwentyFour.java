package chapter03;

public class ThreeTwentyFour {

	public static void main(String[] args) {
	int guess = (int)( Math.random() * 13);
	int guess1 = (int)(Math.random() * 3);
	switch(guess) {
	case 0: System.out.println("Ace");break;
	case 1: System.out.println("2");break;
	case 2: System.out.println("3");break;
	case 3: System.out.println("4");break;
	case 4: System.out.println("5");break;
	case 5: System.out.println("6");break;
	case 6: System.out.println("7");break;
	case 7: System.out.println("8");break;
	case 8: System.out.println("9");break;
	case 9: System.out.println("10");break;
	case 10: System.out.println("Jack");break;
	case 11: System.out.println("Queen");break;
	case 12: System.out.println("King");
	}
	
	System.out.println(" of ");
	
	switch(guess1) {
	case 0: System.out.println("Clubs");break;
	case 1: System.out.println("Diamonds");break;
	case 2: System.out.println("Hearts");break;
	case 3: System.out.println("Spades");
	}
	
	}
	}


