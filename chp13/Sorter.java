package chp13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Sorter {
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f = new File("C://CompSciFiles/Sorter.txt");
		Scanner scan = new Scanner(f);
		Scanner scan2 = new Scanner(f);
		String[] arr=read(scan, scan2);
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static String[] read(Scanner scan, Scanner scan2) 
	{
		
		int length=0;
		while(true) 
		{
			if(scan.hasNextLine()) 
			{
				scan.nextLine();
				length++;
			}
			else
			{
				break;
			}
		}
		String[] str = new String[length];
		
		for(int i=0; i<length; i++) 
		{
			str[i]=scan2.nextLine();
		}
		return str;
	}
	
	public static void mergeSort(String[] in) 
	{
		String[] arr = new String[in.length];
		mergeSortHelper(in, 0, in.length-1, arr);
		
	}
	
	private static void mergeSortHelper(String[] elements, int from, int to, String[] temp) 
	{
		if(from<to) 
		{
			int middle=(from+to)/2;
			mergeSortHelper(elements, from, middle, temp);
			mergeSortHelper(elements, middle+1, to, temp);
			merge(elements, from, middle, to, temp);
		}
	}
	
	private static void merge(String[] elements, int from, int mid, int to, String[] temp) 
	{
		int i =from;
		int j=mid+1;
		int k = from;
		
		while(i<=mid&&j<=to) 
		{
			if(elements[i].toLowerCase().compareTo(elements[j].toLowerCase())<0) 
			{
				temp[k]=elements[i];
				i++;
			}
			else 
			{
				temp[k]=elements[j];
				j++;
			}
			k++;
		}
		while(i<=mid) 
		{
			temp[k]=elements[i];
			i++;
			k++;
		}
		while(j<=to) 
		{
			temp[k]=elements[j];
			j++;
			k++;
		}
		for(k=from; k<=to; k++) 
		{
			elements[k]=temp[k];
		}
	}
}
