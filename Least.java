import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class TestMain {
    public static void main(String args[])
    {String str;
    int i,j,count=0;
    
    Scanner s=new Scanner(System.in);
    str=s.nextLine();
// String  st= str.replaceAll(",", "");
 int len=str.length();
 int m[]=new int[len];
    //System.out.println(st);
    int g=Integer.parseInt(str);
    int d[]=new int[len];
    int ns[]=new int[len];
    while(g>0)
    {for(i=0;i<len;i++)
    {m[i]=g%10;
    g=g/10;
    }
    for(i=0;i<len;i++)
    {System.out.println(m[i]);
    }
    ArrayList <Integer> n=new ArrayList<Integer>();
    for(i=0;i<len;i++)
    {
    n.add(m[i]);
    Collections.sort(n);
    }
    n.remove(len-1);
    n.remove(len-2);
    n.remove(len-3);
    {
        System.out.println(n);
     }
    }
    }}

