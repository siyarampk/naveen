import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        in.readLine();
        for(int n=0;n<t;n++)
        {
            Map<String,Integer> mp=new TreeMap<>();
            String s;
            int l=0;
            while((s=in.readLine())!=null)
            {
                if(s.length()==0)
                    break;
                if(mp.containsKey(s))
                    mp.put(s,mp.get(s)+1);
                else
                    mp.put(s,1);
            l++;
            }
            for(String i:mp.keySet())
                 System.out.printf("%s %.4f\n",i,mp.get(i)*100.0/l);
             if(n<t-1)
                System.out.println();
                
                
            
        }
    }
}
