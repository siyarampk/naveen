import java.util.*;
import java.io.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int a=in.nextInt();
            int c=0,d=0,l=0,m=0,x=0,y=0;
            c=(a*567);
            d=(c/9);
            l=(d+7492);
            m= (l*235);
            x=(m/47);
            y=(x-498);
            String s = String.valueOf(y);
            char b[]=s.toCharArray();
            System.out.println(b[b.length-2]);
        }
    }
}
