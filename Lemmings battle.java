import java.io.*;
import java.util.*;
class  Main
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a[] =new int[3];
            PriorityQueue<Integer> green =new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer>blue =new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<3;j++)
                a[j]=in.nextInt();
            for(int x=0;x<a[1];x++)
                green.add(in.nextInt());
            for(int y=0;y<a[2];y++)
                blue.add(in.nextInt());
            while(true)
            {
                if(green.isEmpty() && blue.isEmpty())
                {
                    System.out.println("green and blue died");
                    break;
                }
                else if(green.isEmpty())
                {
                    System.out.println("blue wins");
                    while(!blue.isEmpty())
                        System.out.println(blue.poll());
                    break;
                    
                }
                else if(blue.isEmpty())
                {
                    System.out.println("green wins");
                    while(!green.isEmpty())
                        System.out.println(green.poll());
                    break;
                }
                else
                {
                    int c=0;
                    ArrayList<Integer> m=new ArrayList<>();
                    ArrayList<Integer> n=new ArrayList<>();
                    while(!green.isEmpty() &&  !blue.isEmpty() && c<a[0])
                    {
                        int g=green.poll();
                        int h=blue.poll();
                        if(g>h)
                            m.add(g-h);
                        else if(h>g)
                            n.add(h-g);
                        c++;
                    }
                    green.addAll(m);
                    blue.addAll(n);
                        
                    }
                }
                if(i+1<t)
                    System.out.println();
            }
        }
    }
