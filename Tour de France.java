import java.io.*;
import java.util.*;
import java.lang.*;
class Main 
{
    public static void main (String [] args)
    {
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
            int f=in.nextInt();
            if(f==0)
                break;
            int r=in.nextInt();
            int a[]=new int[f];
            int b[]=new int[r];
            for(int i=0;i<f;i++)
            {
                a[i]=in.nextInt();
                
            }
            for(int i=0;i<r;i++)
            {
                b[i]=in.nextInt();
            }
            ArrayList<Double>hs=new ArrayList<>();
            for(int i=0;i<f;i++)
            {
                for(int j=0;j<r;j++)
                {
                    hs.add(b[j]*1.0/a[i]);
                }
            }
            Collections.sort(hs);
            double p=-1;
            for(int i=0;i<hs.size()-1;i++)
                    p=Math.max(p,hs.get(i+1)/hs.get(i));
            System.out.printf("%.2f\n",p);
        }
    }
}
