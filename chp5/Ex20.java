package chp5;

public class Ex20 {
	public static void main(String[] args) 
	{
		System.out.println(digitRange(1));
	}
	public static int digitRange(int num) 
	{
		int high = 0;
		int low = 9;
		for(int i = 1; i<=Integer.toString(num).length(); i++) 
		{
			if(num%10 > high) {high = num%10;}
			if(num%10 < low) {low = num%10;}
			num/=10;
		}
		if(Integer.toString(num).length()==1) {return 1;}
		return high-low;
	}
}
