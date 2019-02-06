import java.util.*;
import java.io.*;
import java.lang.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                    a[i]=in.nextInt();    
            HashSet<Integer> hs=new HashSet<Integer>();
            for(int i=0;i<n-1;i++)
            {
                int abs=Math.abs(a[i+1]-a[i]);
                if(abs<=a.length-1 && abs>0)
                    hs.add(abs);
                else
                    {break;}
                    
            }
            if(hs.size()==a.length-1)
                System.out.println("Jolly");
            else    
                System.out.println("Not jolly");
            
        }
        
    }
}
