import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0"))
        {
            int n=Integer.parseInt(s);
            long c=0;
            TreeMap<Integer,Integer> m=new TreeMap<>();
            for(int i=0;i<n;i++)
            {
                StringTokenizer st=new StringTokenizer(in.readLine());
                int k=Integer.parseInt(st.nextToken());
                for(int j=0;j<k;j++)
                {
                    int p=Integer.parseInt(st.nextToken());
                    m.put(p,m.getOrDefault(p,0)+1);
                    
                }
                int h=m.lastKey();
                if(m.get(h)==1)
                    m.remove(h);
                else
                    m.put(h,m.get(h)-1);
                
                int l=m.firstKey();
                if(m.get(l)==1)
                    m.remove(l);
                else
                    m.put(l,m.get(l)-1);
                c=c+(h-l);
                
            }
            System.out.println(c);
        }
    }
}
