import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		char c;
		int k=0;
		Scanner s = new Scanner(System.in);
		c = s.next().charAt(0);
		if(c>='a' && c<='z' || c>='A' && c<='Z')
		{
			k++;
		}
		if(k!=0)
		{
			System.out.print("Alphabet");
			
		}
		else
		{
			System.out.print("Not an Alphabet");
		}

	}

}
