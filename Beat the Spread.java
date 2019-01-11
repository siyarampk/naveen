import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args)
	 {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    while(n-->0)
	    {
	        int s=in.nextInt();
	        int d=in.nextInt();
	        if((s<d)||(s+d)%2!=0)
	            System.out.println("impossible");
            else
            {   int a=(s+d)/2;
                int b=(s-d)/2;
                System.out.println(Math.max(a,b)+" "+Math.min(a,b));
                
            }
	        
	        
	    }
	 }
}
