import java.io.*;
import java.util.*;
import java.lang.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int a[]=new int[n];
            int p=0;
            for(int k=0;k<n;k++)
            {
                a[k]=in.nextInt();
            }
            for(int i=1;i<n;i++)
            {
                
                if(i>0)
                {
                    for(int j=0;j<i;j++)
                    {
                        if(a[j]<=a[i])
                            p++;
                    }
                    
                }
            }
            System.out.println(p);
            
        }
    }
}
