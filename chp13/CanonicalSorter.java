package chp13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class CanonicalSorter {
	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("C://CompSciFiles/dictionary.txt");
		Scanner scan1 = new Scanner(f);
		Scanner scan2=new Scanner(f);
		CanonicalComparator c = new CanonicalComparator();
		String[] arr = readToArr(scan1, scan2);
		
		final long startTime = System.currentTimeMillis();
		bubbleSort(arr, c);
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		System.out.println(Arrays.toString(arr));
	}
	public static String[] readToArr(Scanner scan1, Scanner scan2) 
	{
		int length=0;
		while(true) 
		{
			if(scan1.hasNextLine()) 
			{
				length++;
				scan1.nextLine();
			}
			else 
			{
				break;
			}
		}
		
		String[] arr = new String[length];
		
		for(int i = 0; i<length; i++) 
		{
			arr[i]=scan2.nextLine();
		}
		
		return arr;
		
	}
	
	public static void bubbleSort(String[] arr, CanonicalComparator c) 
	{
		int flips=0;
		while(true) 
		{
			for(int i=0; i<arr.length-1; i++) 
			{
				if(c.compare(arr[i], arr[i+1])<0) 
				{
					String temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
					flips++;
				}
			}
			if(flips==0) 
			{
				break;
			}
			flips=0;
		}
	}
}
