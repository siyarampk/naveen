import java.io.*;
import java.util.*;
import java.lang.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        boolean t[]=new boolean[1000001];
        for(;;)
        {
            int m=in.nextInt();
            int n=in.nextInt();
            if(n==0 && m==0)
            {
                break;
            }
            boolean conflict=false;
            Arrays.fill(t,false);
            for(int i=0;i<m;i++)
            {
                int x=in.nextInt();
                int y=in.nextInt();
                if(!conflict && !check(x,y,t))
                    conflict=true;
            }
            for(int i=0;i<n;i++)
            {
                int x=in.nextInt();
                int y=in.nextInt();
                int z=in.nextInt();
                while(!conflict && x<1000000)
                {
                    if(!check(x,y,t))
                        conflict=true;
                    x=x+z;
                    y=Math.min(y+z,1000000);
                }
            }
            if(!conflict)
                System.out.println("NO CONFLICT");
            else    
                System.out.println("CONFLICT");
                
                
            }
            
        }
        public static boolean check(int x,int y,boolean t[])
        {
            int k=0;
            for( k=x;k<y;k++)
            {
                if(t[k])
                    return false;
                t[k]=true;
            }
            return true;
                    
                
            }
        }
    
