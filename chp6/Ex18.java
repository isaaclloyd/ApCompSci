package chp6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args)throws FileNotFoundException 
	{
		File f = new File("C://CompSciFiles/plusScores.txt");
		Scanner scan = new Scanner(f);
		plusScores(scan);
	}
	public static void plusScores(Scanner scan) 
	{
		int i = 1;
		String s = "";
		double plus=0.0;
		double percent = 0;
		while(scan.hasNextLine()) 
		{
			s=scan.nextLine();
			if((int)i%2!=0) 
			{
				System.out.print(s+": ");
				
			}
			else if((int)i%2==0) 
			{
				for(int j = 0; j<s.length(); j++) 
				{
					if(s.charAt(j)=='+') 
					{
						plus+=1.0;
					}
				}
				percent=plus/s.length()*100;
				System.out.println(percent+"% plus");
			}
			i++;
			plus=0.0;
		}
	}
}
