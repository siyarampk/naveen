
import java.io.*;
import java.lang.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String s = sc.next();
           int i = 1;
            
           while(s.charAt(0) !='#'){
               System.out.print("Case "+(i++) +": ");
               if(s.equals("HELLO")){
                   System.out.println("ENGLISH");
               }else if(s.equals("HOLA")){
                   System.out.println("SPANISH");
               }else if(s.equals("HALLO")){
                   System.out.println("GERMAN");
               }else if(s.equals("BONJOUR")){
                   System.out.println("FRENCH");
               }else if(s.equals("CIAO")){
                   System.out.println("ITALIAN");
               }else if(s.equals("ZDRAVSTVUJTE")){
                   System.out.println("RUSSIAN");
               }else{
                   System.out.println("UNKNOWN");
               }
               s = sc.next();
           }
    }
}
