package chp3;

import java.util.Scanner;

public class Project6 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		calendar(scan);
	}
	public static void calendar(Scanner scan) 
	{
		System.out.println("how many days in the month?");
		int days = scan.nextInt();
		System.out.println("what day of the month is the first sunday?");
		int sunday = scan.nextInt();
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat   ");
		System.out.println("+------+------+------+------+------+------+------+");
		int spaces = 0;
		int count = 0;
		int cnt = 0;
		
		if(sunday != 1) {spaces = 7-sunday;}
		
		System.out.print("|");
		for(int i = 0; i<=spaces; i++) 
		{
			System.out.print("      |");
			count++;
		}
		
		for(int i = 1; i<= days; i++) 
		{
			System.out.print(padded(4, i) + "  |");
			count++;
			if(count % 7 == 0 && i != days) 
			{
				System.out.println();
				System.out.print("|");
				cnt = 0;
			}
			cnt++;
		}
		
		for(int i = 0; i<=7-cnt; i++) 
		{
			System.out.print("      |");
			count++;
		}
		System.out.println();
		
		System.out.println("+------+------+------+------+------+------+------+");
		
		
	}
	public static String padded(int space, int number) 
	{
		String s = "" + number;
		String result = "";
		for(int i = 1; i<=space-s.length(); i++) 
		{
			result += " ";
		}
		result += s;
		return(result);
	} 
}
