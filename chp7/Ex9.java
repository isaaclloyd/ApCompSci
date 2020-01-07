package chp7;

public class Ex9 {
	public static void main(String[] args) 
	{
		int[] arr= {22, 26, 11, 7, 4, 2, 1, 2, 4, 7, 11, 16, 22};
		System.out.println(minGap(arr));
	}
	public static int minGap(int[] arr) 
	{
		int result = 0;
		if(arr.length>=2) 
		{
			for(int i = 1; i<arr.length; i++) 
			{
				if(arr[i]-arr[i-1]<result) {result=arr[i]-arr[i-1];}
			}
		}
		return result;
	}
}
