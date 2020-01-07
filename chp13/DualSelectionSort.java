package chp13;

import java.util.Arrays;

public class DualSelectionSort {
	public static void main(String[] args) 
	{
		int[] arr = {7, 3, 4231, -2346, 324, 64, 12, 9, 134, 10};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void sort(int[] arr) 
	{
		if(arr.length%2==0) 
		{
			int minI;
			int maxI;
		
			int[] mins = new int[arr.length/2];
			int[] maxs = new int[arr.length/2];
			
			for(int i=0; i<arr.length/2; i++) 
			{
				maxI=arr.length-2-i;
				minI=i+1;
				for(int j=i; j<arr.length-1-i; j++) 
				{
					if(arr[j]>arr[maxI]) 
					{
						//System.out.println(arr[maxI]);
						maxI=j;
						//System.out.println(arr[maxI]+"\n");
						//System.out.println("<><><><><><><><><><><><><><>");
					}
					if(arr[j]<arr[minI]) 
					{
						//System.out.println(arr[minI]);
						minI = j;
						//System.out.println(arr[minI]+"\n");
					}
				}
				mins[i]=arr[minI];
				maxs[i]=arr[maxI];
				
				//System.out.println();
				//System.out.println(arr[minI]+"|"+arr[maxI]);
				//System.out.println("-----------------------");
				
				int temp1=arr[i];
				int temp2=arr[arr.length-1-i];
				
				arr[i]=arr[minI];
				arr[arr.length-1-i]=arr[maxI];
				
				arr[minI]=temp1;
				arr[maxI]=temp2;
				
				//System.out.println(Arrays.toString(mins));
				//System.out.println(Arrays.toString(maxs));
			}
			if(arr[arr.length/2-1]>arr[arr.length/2]) 
			{
				int temp=arr[arr.length/2-1];
				arr[arr.length/2-1]=arr[arr.length/2];
				arr[arr.length/2]=temp;
			}
		}
		else 
		{
			int minI;
			int maxI;
		
			int[] mins = new int[arr.length/2];
			int[] maxs = new int[arr.length/2];
			
			for(int i=0; i<arr.length/2; i++) 
			{
				maxI=arr.length-1-i;
				minI=i;
				for(int j=i; j<arr.length-1-i; j++) 
				{
					if(arr[j]>arr[maxI]) 
					{
						//System.out.println(arr[maxI]);
						maxI=j;
						//System.out.println(arr[maxI]+"\n");
						//System.out.println("<><><><><><><><><><><><><><>");
					}
					if(arr[j]<arr[minI]) 
					{
						//System.out.println(arr[minI]);
						minI = j;
						//System.out.println(arr[minI]+"\n");
					}
				}
				mins[i]=arr[minI];
				maxs[i]=arr[maxI];
				
				//System.out.println();
				//System.out.println(arr[minI]+"|"+arr[maxI]);
				//System.out.println("-----------------------");
				
				int temp1=arr[i];
				int temp2=arr[arr.length-1-i];
				
				arr[i]=arr[minI];
				arr[arr.length-1-i]=arr[maxI];
				
				arr[minI]=temp1;
				arr[maxI]=temp2;
				
				//System.out.println(Arrays.toString(mins));
				//System.out.println(Arrays.toString(maxs));
			}
			if(arr[arr.length/2-1]>arr[arr.length/2]) 
			{
				int temp=arr[arr.length/2-1];
				arr[arr.length/2-1]=arr[arr.length/2];
				arr[arr.length/2]=temp;
			}
			if(mins[mins.length-1]<mins[mins.length-2]) 
			{
				int temp=arr[mins.length-1];
				arr[mins.length-1]=arr[mins.length-2];
				arr[mins.length-2]=temp;
			}
		}
	}
}
