import java.util.Scanner;

public class count2 {
	public static void main(String args[])
	{
		int a,b=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		a = s.nextInt();
		while(a>0)
		{
			a = a/10;
			b++;
		}
		System.out.println(b);
	
		
	
		
	}

}
