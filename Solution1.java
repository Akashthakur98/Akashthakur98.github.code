import java.util.*;
import java.io.*;

class Solution1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a[]=new int[100];
        int b[]=new int[100];
        int n[]=new int[100];
        int t,j=0;
        t=in.nextInt();
        while(j<t)
        {
            a[j]=in.nextInt();
            b[j]=in.nextInt();
            n[j]=in.nextInt();
            j++;
        }
        for(j=0;j<t;j++)
        {   int i,s,x=1,y=0;
            for(i=0;i<n[j];i++)
            {
                s=a[j]+x*b[j]+y;
                System.out.print(s);
                System.out.print(" ");
                a[j]=0;
                y=s;
                s=0;
                x=x*2;
            }
            System.out.println("");
           
        }
    
    }
}
