import java.util.Scanner;

public class Prime {
public static void main(String args[])
{
	int num;
	boolean temp = true;
	Scanner s = new Scanner(System.in);
	num = s.nextInt();
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			temp=false;
			break;
		}
		
	}
	if(temp)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not Prime");
	}
}
}
