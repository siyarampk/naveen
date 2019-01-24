import java.util.*;
import java.io.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int i=1;
        while(t-->0)
        {
            int l=in.nextInt();
            int b=in.nextInt();
            int h=in.nextInt();
            if(l>20 || b>20 || h>20)
                System.out.println("Case "+i+": bad");
            else 
                System.out.println("Case "+i+": good");
            i++;
        }
    }
}
