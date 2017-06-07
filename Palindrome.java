import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		int num,reverse = 0,temp;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		temp = num;
		while(temp>0)
		{
			int d = temp%10;
			temp = temp/10;
			reverse = (reverse*10) + d;
		}
		if(num==reverse)
		{
			System.out.println("The given Number is Palindrome");
		}
		else
		{
			System.out.println("The given Number is Not Palindrome");
		}
	}

}
