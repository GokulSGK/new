import java.util.Scanner;

public class Odd27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
		num[i] = s.nextInt();
		}
		System.out.println("Define the limits");
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		for(int i=a;i<b-1;i++)
		{
		if(num[i]%2!=0)
		{
			System.out.println(num[i]+"IS ODD");
		}
		
		}	

	}

}
