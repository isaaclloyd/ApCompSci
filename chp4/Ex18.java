package chp4;

public class Ex18 {
	public static void main(String[] args) 
	{
		System.out.println(wordCount("Hello there human being."));
	}
	public static int wordCount(String str) 
	{
		int wordCount=0;
		for(int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) == ' ' || i==0) 
			{
				if(i<str.length()-1) 
				{
					if(str.charAt(i+1) != ' ') 
					{
						wordCount++;
					}
				}
			}
		}
		return wordCount;
	}
}
