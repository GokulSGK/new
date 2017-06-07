import java.util.Scanner;

public class Power {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
         int x,y;
         System.out.println("Enter the base");
         x = s.nextInt();
         System.out.println("Enter the power");
         y = s.nextInt();
         double d = Math.pow(x, y);
         System.out.println("Power value is"+d);
	}

}
