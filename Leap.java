import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if(n%4==0 && n%100!=0)
		{
            System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}

	}

}
