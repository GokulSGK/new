import java.util.Scanner;

public class sumn {
	public static void main(String args[])
	{
		int n,sum=0,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit");
		n = s.nextInt();
		for(temp=1;temp<=n;temp++)
		{
			sum = sum+temp;
		}
		System.out.println(sum);
	}

}
