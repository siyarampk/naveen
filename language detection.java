import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        String s;
        int i=1;
        while(in.hasNext())
        {   
            s=in.next();
            if(s.equals("#"))
                break;
            if(s.equals("HELLO"))
                System.out.println("Case "+i+": "+"ENGLISH");
            else if(s.equals("HOLA"))
                System.out.println("Case "+i+": "+"SPANISH");
            else if(s.equals("HALLO"))
                System.out.println("Case "+i+": "+"GERMAN");
            else if(s.equals("BONJOUR"))
                System.out.println("Case "+i+": "+"FRENCH");
            else if(s.equals("CIAO"))
                System.out.println("Case "+i+": "+"ITALIAN");  
            else if(s.equals("ZDRAVSTVUJTE"))
                System.out.println("Case "+i+": "+"RUSSIAN");
         i++;
        }
       
        
    }
}
