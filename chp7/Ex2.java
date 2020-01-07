package chp7;

public class Ex2 {
	public static void main(String[] args) 
	{
		int[] arr = {22, 44, 55, 22, 33, 44, 55, 22, 33, 44, 55, 22, 33, 44, 55};
		System.out.println(range(arr));
		System.out.println(countInRange(arr, 1, 40));
		System.out.println(isSorted(arr));
	}
	public static int lastIndexOf(int[] arr, int num) 
	{
		int result = -1;
		for(int i = 0; i<arr.length; i++) 
		{
			if(arr[i]==num) 
			{
				result=i;
			}
		}
		return result;
	}
	public static int range(int[] arr) 
	{
		int high = -2147483648;
		int low = 2147483647;
		for(int i = 0; i<arr.length; i++) 
		{
			if(arr[i]>high) 
			{
				high=arr[i];
			}
			if(arr[i]<low)
			{
				low=arr[i];
			}
		}
		return high-low+1;
	}
	public static int countInRange(int arr[], int min, int max) 
	{
		int result=0;
		for(int i = 0; i<arr.length; i++) 
		{
			if(arr[i]>min && arr[i]<max) 
			{
				result++;
			}
		}
		return result;
	}
	public static boolean isSorted(int[] arr) 
	{
		for(int i = 1; i<arr.length; i++) 
		{
			if(arr[i-1]<arr[i]) {return false;}
		}
		return true;
	}
}
