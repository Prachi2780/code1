import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;


public class allsubsets 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String x=sc.next();
        subseq("",x);

        System.out.println("\n\nALITER METHOD\n\n");
        
        int l=x.length();
        ArrayList<String> ans=new ArrayList<>();
        ans=subseq1("",x);
      
        for(int i=0;i<Math.pow(2,l);i++)
        {
            System.out.println(ans.get(i));
        }
        sc.close();
    }
    static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    //ALITER
    static ArrayList<String> subseq1(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseq1(p+ch, up.substring(1));
        ArrayList<String> right=subseq1(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    
}
