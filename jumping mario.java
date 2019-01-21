

import java.io.*;
import java.util.*;


class Main
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		for( int i=0;i<t;i++)
		{
		    int n=in.nextInt();
		    int a[]=new int[n];
		    		    int h=0,l=0;
		    for(int j=0;j<n;j++)
		    {
		        int b=in.nextInt();
		        a[j]=b;
		        if(j!=0)
		        {
		            if(a[j]>a[j-1])
		            h++;
		            if(a[j]<a[j-1])
		            l++;
		        }
		        
		    }
		    System.out.println("Case "+(i+1)+": "+ h+" "+ l);
		}
	}
}
