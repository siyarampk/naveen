import java.io.*;
import java.util.*;
import java.lang.*;
class Main
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t-->0)
        {
            StringTokenizer st=new StringTokenizer(in.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            boolean count=false;
            for(int i=-22;i<=22 && !count ;i++)
            {
                for(int j=-100;j<=100&& !count;j++)
                {
                    if(i!=j && i*i+j*j<=c)
                    {
                        int p=a-i-j;
                        if(i!=p && j!=p && i*j*p==b && i*i+j*j+p*p==c)
                        {
                            System.out.println(i+" "+j+" "+p);
                            count=true;
                        }
                    }
                }
            }
            if(!count)
                System.out.println("No solution.");
            
        }
    }
}
