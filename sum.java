import java.util.Scanner;

public class sum {
	public static void main(String args[])
	{
		int a,b=0,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit");
		a = s.nextInt();
		for(c=1;c<=a;c++)
		{
			b = b+c;
		}
		System.out.println(b);
	}

}
