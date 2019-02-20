import java.io.*;
import java.util.*;
import java.lang.*;
class  Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int q=0;
        while(t-->0)
        {
            if(q>0)
                System.out.println();
                q++;
            int a=in.nextInt();
            String s[]=new String[a];
            int k[]=new int[a];
            int l[]=new int[a];
            for(int i=0;i<a;i++)
            {
                s[i]=in.next();
                k[i]=in.nextInt();
                l[i]=in.nextInt();
                
            }
            int b=in.nextInt();
            int x,y,z;
            String p="";
            for(int i=0;i<b;i++)
            {
                x=in.nextInt();
                y=0;z=0;
                for(int j=0;j<a;j++)
                {
                    if(x>=k[j] && x<=l[j] )
                    {
                        if(z==0)
                            p=s[j];
                            z++;
                            y=1;
                            
                    }
                }
                if(y==0 || z>1)
                    System.out.println("UNDETERMINED");
                else    
                    System.out.println(p);
            }
        }
    }
}
