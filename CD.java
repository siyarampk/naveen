import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            StringTokenizer st=new StringTokenizer(in.readLine());
            int m=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            if(n==0 && m==0)
                break;
            Set<Integer>s=new TreeSet<>();
            for(int i=0;i<m;i++)
                s.add(Integer.parseInt(in.readLine()));
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(s.contains(Integer.parseInt(in.readLine())))
                c++;
            }
            System.out.println(c);
            
        }
        
    }
}
