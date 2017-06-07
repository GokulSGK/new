import java.util.Scanner;
public class Fact
{
public static void main(String args[])
{
int n;
Scanner s = new Scanner(System.in);
n = s.nextInt();
int j=1;
for(int i=1;i<=n;i++)
{
j = j*i;
}
System.out.print(j);
}}
