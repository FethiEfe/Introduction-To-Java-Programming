package chapter03;
import java.util.Scanner;

public class ThreeEleven {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number for month and year");
	int month = input.nextInt();
	int year = input.nextInt();
	boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	switch (month) {
	case 0: System.out.println("0 ile 13 arasinda bir sayi giriniz "); break;
	case 1: System.out.println("Ocak ayi 31 gundur");break;
	
	// TODO artik yili bul
	case 2: System.out.println("Subat ayi" +((leapYear) ? " 29 days" : " 28 days")); break ;
	case 3: System.out.println("Mart ayi 31 gundur "); break;
	case 4: System.out.println("Nisan ayi 30 gundur "); break;
	case 5: System.out.println("Mayis ayi 31 gundur"); break;
	case 6: System.out.println("Haziran ayi 30"); break;
	case 7: System.out.println("Temmiz 31"); break;
	case 8: System.out.println("Agustos 31"); break;
	case 9: System.out.println("Eylul 30 "); break;
	case 10: System.out.println("Ekim 31"); break;
	case 11: System.out.println("Kasim 30"); break;
	case 12: System.out.println("Aralik 31"); break;
	}
	
	}

}
