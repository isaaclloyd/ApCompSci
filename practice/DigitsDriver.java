package practice;

public class DigitsDriver {
	public static void main(String[] args) 
	{
		Digits d = new Digits(12345);
		System.out.println(d.getDigitList());
		System.out.println(d.isStrictlyIncreasing());
	}
}
