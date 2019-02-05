import java.util.*;
import java.io.*;
import java.lang.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(s.equals("#"))
                break;
            char c[]=s.toCharArray();
            if(permutation(c))
            {
                System.out.println(new String(c));
            }
            else
            {
                System.out.println("No Successor");
            }
        }
    }
    static boolean permutation(char [] p)
    {
        for(int a=p.length-2;a>=0;a--)
        {
            if(p[a]<p[a+1])
            {
                for(int b=p.length-1;;--b)
                {
                    if(p[b]>p[a])
                    {
                        char t=p[a];
                        p[a]=p[b];
                        p[b]=t;
                        for(++a,b=p.length-1;a<b;++a,--b)
                        {
                            t=p[a];
                            p[a]=p[b];
                            p[b]=t;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
