import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
	
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		if(num%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}

	}

}
