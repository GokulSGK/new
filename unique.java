

import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang.ArrayUtils;

public class unique {
    public static void main(String args[])
    {
         int a[] = new int[5];
        Scanner s = new Scanner(System.in);
        int i,j;
        for(i=0;i<5;i++)
        {
            a[i] = s.nextInt();
        }
        for(i=0;i<a.length;i++)
	{
	for(j=1;j<a.length;j++)
	    {
		if(a[i] == a[j])
		{
			Arrays.toString(a);
                        a = ArrayUtils.remove(a,i);
                        a = ArrayUtils.remove(a,j);
		}
		}}
	    for(i=0;i<a.length;i++)
	    {
        System.out.print(a[i]);
	    }
    }
    
}
