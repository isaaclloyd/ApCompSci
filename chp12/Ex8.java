package chp12;

public class Ex8 {
	public static void main(String[] args) 
	{
		System.out.println(multiplyEvens(4));
	}
	public static int multiplyEvens(int n) 
	{
		if(n<=0) 
		{
			throw(new IllegalArgumentException());
		}
		else if(n==1) 
		{
			return 2;
		}
		else
		{
			return 2*n * multiplyEvens(n-1);
		}
	}
}
