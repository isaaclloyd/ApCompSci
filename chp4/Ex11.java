package chp4;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        longestName(scan, 2);
    }

    public static void longestName(Scanner scan, int n)
    {
        String longestName = "";
        String curr = "";
        for(int i = 1; i<=n; i++)
        {
        	System.out.println("Name "+i+"? ");
        	curr = scan.next();
            if(curr.length()>longestName.length())
            {
                longestName = curr;
            }
            
            
        }
        String result = longestName.toLowerCase();
        String p1 = result.substring(1);
        String p2 = result.substring(0, 1);
        p2 = p2.toUpperCase();
        result = p2+p1;
        System.out.println(result+"'s name is the longest");
    }
}


