package chp4;

public class Ex17 {
	public static void main(String[] args) 
	{
		System.out.println(swapPairs("star"));
	}
	public static String swapPairs(String str) 
	{
		String result = str;
		for(int i = 0; i<str.length(); i+=2) 
		{
				result = result.substring(0, i)+str.charAt(i+1)+str.charAt(i)+str.substring(i+1, str.length()-1);
		}
		return(result);
	} 
}
