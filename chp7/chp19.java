package chp7;

public class chp19 {
	public static void main(String[] args) 
	{
		int[][] a = {{1, 1},{1, 1},{1, 1},{1, 1},{1, 1},{1, 1},{1, 1},{1, 1}};
		int[][] b = {{2, 2},{2, 2},{2, 2},{2, 2},{2, 2},{2, 2},{2, 2},{2, 2}};
		print2DArr(matrixAdd(a, b));
		
	}
	public static int[][] matrixAdd(int[][] a, int[][] b)
	{
		int[][] result = new int[a.length][];
		for(int i = 0; i<a.length; i++) 
		{
			result[i]=new int[a[0].length];
			for(int j = 0; j<a[0].length; j++) 
			{
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		return result;
	}
	public static void print2DArr(int[][] a) 
	{
		for(int i = 0; i<a.length; i++) 
		{
			for(int j = 0; j<a[0].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
