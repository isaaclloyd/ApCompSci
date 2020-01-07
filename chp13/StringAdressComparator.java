package chp13;

import java.util.Comparator;

public class StringAdressComparator implements Comparator{
	public int compare(Object a, Object b) 
	{
		if(a instanceof String && b instanceof String) 
		{
			String aStr="";
			String bStr="";
			for(int i = 0; i<((String)a).length(); i++) 
			{
				if(((String)a).charAt(i)==' ') 
				{
					aStr=((String)a).substring(i);
				}
			}
			for(int i = 0; i<((String)b).length(); i++) 
			{
				if(((String)b).charAt(i)==' ') 
				{
					bStr=((String)b).substring(i);
				}
			}
			
			int aInt = Integer.parseInt(aStr);
			int bInt = Integer.parseInt(bStr);
			
			return aInt-bInt;
		}
		else 
		{
			return (Integer) null;
		}
	}

}
