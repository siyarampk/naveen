import java.io.*;
import java.lang.*;
import java.util.*;
class Main 
{
    
    
    public static boolean count=false;
       
       public static void bars(int a[],int x,int y,int n)
        {
            if(y==n)
            {
                count=true;
            }
            else if(!count)
            {
                for(int i=x;i<a.length;i++)
                {
                    if(y+a[i]<=n)
                    {
                        bars(a,i+1,y+a[i],n);
                    }
                }
            }
        
    }
    public static void main(String [] args) throws IOException
   {

        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(in.readLine());
       while(t-->0)
       {
           int n=Integer.parseInt(in.readLine());
           int b=Integer.parseInt(in.readLine());
           StringTokenizer st=new StringTokenizer(in.readLine());
           int a[]=new int[b];
           for(int i=0;i<b;i++)
           {
               a[i]=Integer.parseInt(st.nextToken());
               
           }
           Arrays.sort(a);
           count=false;
           bars(a,0,0,n);
           if(count)
           {
               System.out.println("YES");
           }
           else
           {
               System.out.println("NO");
           }
       }
   }
   
   
   
}
