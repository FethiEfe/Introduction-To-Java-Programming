package chapter02;
/* show current time */
public class Listing_2_7 {
	public static void main(String[] args) {	
		long totalmillis = System.currentTimeMillis();
		long totalseconds = totalmillis / 1000 ;
		long currentsecond = totalseconds % 60 ;
		long totalmins = totalseconds / 60 ;
		long currentmins = totalmins % 60 ;
		long totalhours = totalmins / 60 ;
		long currenthour = totalhours % 24 ;
		System.out.println(" Time is " + currenthour + ":" + currentmins + ":" + currentsecond );
		
		
				
	}
	
}


