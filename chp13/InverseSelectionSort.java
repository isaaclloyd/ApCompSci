package chp13;

import java.util.Arrays;

public class InverseSelectionSort {
	public static void main(String[] args) 
	{
		int[] arr = {1,7,3,-7,123,16,43,2,9,32,152,-12325};
		InversedSelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void InversedSelectionSort(int[] elements) 
	{
		for(int j=elements.length-1; j>=0; j--) 
		{
			int maxIndex=j;
			for(int k = j-1; k>=0; k--) 
			{
				if(elements[k]<elements[maxIndex]) 
				{
					maxIndex=k;
				} 
			}
			int temp=elements[maxIndex];
			elements[maxIndex]=elements[j];
			elements[j]=temp;
		}
	}
}
