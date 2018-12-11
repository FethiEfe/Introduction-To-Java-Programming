package chapter03;

public class ThreeSixteen {

	public static void main(String[] args) {
		int width = (int)(-50 + Math.random() * 100 );
		int height = (int)(-100 + Math.random() * 200);
        // -50 <= width < -50 + 100
		// -100 <= height < 200
		System.out.println("Random coordinate in rectangle centered at (0,0)");
		System.out.println(
			"with width 100 and height 200: (" + width + ", " + height + ")");
	}
}
	
