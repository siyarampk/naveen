import java.io.*;
import java.util.*;
import java.lang.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>a=new ArrayList<>();
        int i=0;
        while(i<=20)
        {
            if(!a.contains(i))
                a.add(i);
            if(!a.contains(i+i))
                a.add(i+i);
            if(!a.contains(i+i+i))
                a.add(i+i+i);
            i++;
            
        }
        a.add(50);
        Collections.sort(a);
        String s="";
        for(int j=0;j<70;j++)
            s=s+"*";
        while(true)
        {
            int p=in.nextInt();
            int m=0,n=0;
            if(p<=0)
                break;
            for(int x=0;x<a.size();x++)
            {
                for(int y=0;y<a.size();y++)
                {
                    for(int z=0;z<a.size();z++)
                    {
                        if(a.get(x)+a.get(y)+a.get(z)==p)
                        {
                            m++;
                            if(y>=x && z>=y)
                                n++;
                        }
                        
                    }
                }
            }
            if(n==0)
                System.out.println("THE SCORE OF "+p+" CANNOT BE MADE WITH THREE DARTS.");
            else
            {
                System.out.println("NUMBER OF COMBINATIONS THAT SCORES "+p+" IS "+n+".");
                System.out.println("NUMBER OF PERMUTATIONS THAT SCORES "+p+" IS "+m+".");
            }
            System.out.println(s);
            
        }
        System.out.println("END OF OUTPUT");
    }
}
