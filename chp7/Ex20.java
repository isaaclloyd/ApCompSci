package chp7;

public class Ex20 {
	public static void main(String[] args) 
	{
		int[][] a = {{2, 7, 5},{9, 5, 1},{4, 3, 8}};
		System.out.println(isMagicSquare(a));
	}
	public static boolean isMagicSquare(int[][] arr) 
	{
		int sum = 0;
		int test = 0;
		//first row
		for(int i=0; i<arr[0].length; i++) 
		{
			sum+=arr[0][i];
		}
		//rows
		for(int i = 1; i<arr.length; i++) 
		{
			for(int j=0; j<arr[0].length; j++) 
			{
				test+=arr[i][j];
			}
			if(test!=sum) 
			{
				System.out.println("rows");
				return false;
			}
			test=0;
		}
		//columns
		for(int i = 0; i<arr[0].length; i++) 
		{
			for(int j=0; j<arr.length; j++) 
			{
				test+=arr[j][i];
			}
			if(test!=sum) 
			{
				System.out.println("columns");
				return false;
			}
			test=0;
		}
		//diagonals
		int i=0;
		int j=0;
		while(i<arr.length && j<arr.length) 
		{
			test+=arr[i][j];
			i++;
			j++;
		}
		if(test!=sum) {System.out.println("d1"); return false;}
		i=arr.length-1;
		j=0;
		test=0;
		while(i>=0 && j<arr[0].length) 
		{
			test+=arr[i][j];
			i--;
			j++;
		}
		if(test!=sum) {System.out.println(test); return false;}
		return true;
	}
}
