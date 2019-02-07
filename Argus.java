import java.io.*;
import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        while(in.hasNext())
        {
            String s=in.next();
            if(s.equals("#"))
                break;
            int n=in.nextInt();
            int m=in.nextInt();
            a.add(n);
            b.add(m);
            c.add(m);
            
        }
        int l=in.nextInt();
        int x=0,y=0;
        for(int i=0;i<l;i++)
        {
            x=argus(a,b,c);
            System.out.println(a.get(x));
        }
        
    }
    public static int argus(List<Integer> a,List<Integer> b,List<Integer>c)
    {
        int m1=100000,m2=0;
        for(int i=0;i<b.size();i++)
        {
            if(b.get(i)<m1)
            {
                m1=b.get(i);
                m2=i;
            }
            if(b.get(i)==m1)
            {
                if(a.get(i)<a.get(m2))
                {
                    m1=b.get(i);
                    m2=i;
                }
            }
        }
        b.set(m2,b.get(m2)+c.get(m2));
        return m2;
    }
}
