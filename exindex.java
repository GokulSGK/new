

import java.util.Scanner;
import java.util.*;

public class Exindex {

    public static void main(String[] args) {
        int a[] = new int[10];
        int j=0;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
        a[i] = s.nextInt();
        }
        for(j=0;j<10;j++)
        {
            if(j==a[j])
            {
                System.out.println("The array value and index is same for"+j);
            }
        }

        
    }
    
}
