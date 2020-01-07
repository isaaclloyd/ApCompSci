package chp5;

public class Ex22 {
	public static void main(String[] args) 
	{
		System.out.println(allDigitsOdd(8135798));
	}
	public static boolean allDigitsOdd(int num) 
	{
		for(int i = 1; i<=Integer.toString(num).length(); i++) 
		{
			if((num%10)%2==0) {return false;}
			num/=10;
		}
		return true;
	}
}
