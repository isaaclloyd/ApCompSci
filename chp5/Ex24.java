package chp5;

public class Ex24 {
	public static void main(String[] args) 
	{
		System.out.println(isAllVowels("aeiou"));
	}
	public static boolean isAllVowels(String str) 
	{
		str=str.toLowerCase();
		for(int i = 0; i<str.length(); i++) 
		{
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') 
			{
				return false;
			}
		}
		return true;
	}
}
