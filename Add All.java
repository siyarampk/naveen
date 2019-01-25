import java.util.PriorityQueue;
import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        String s;
        while(in.hasNext())
        {
            int n=in.nextInt();
            if(n==0)
                break;
            PriorityQueue<Long> p=new PriorityQueue<Long>();
            for(int i=0;i<n;i++)
            {
                p.offer(in.nextLong());
            }
            long c=0;
            while(!p.isEmpty() && n>1)
            {
                Long x=p.poll()+p.poll();
                c=c+x;
                p.offer(x);
                n--;
            }
            System.out.println(c);
        }
    }
}
