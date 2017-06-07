import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if(a>b)
		{
			b=a;
		}
		if(b>c)
		{
			System.out.println(b+"  is largest");
		}
			
		else
		{
			System.out.println(c+"  is largest");
		}
			
	}

}
