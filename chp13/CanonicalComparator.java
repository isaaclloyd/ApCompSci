package chp13;

import java.util.Comparator;

public class CanonicalComparator implements Comparator{

	
	public int compare(Object a, Object b) {
		if(a instanceof String && b instanceof String) 
		{
			
			String a2="";
			String b2="";
			char curr='z';
			for(int i=0; i<((String)a).length(); i++) 
			{
				for(int j=i; j<((String)a).length(); j++) 
				{
					if((int)((String)a).charAt(i)<curr) 
					{
						curr=((String)a).charAt(i);
					}
					a2+=curr;
					curr='z';
				}
			}
			for(int i=0; i<((String)b).length(); i++) 
			{
				for(int j=i; j<((String)b).length(); j++) 
				{
					if((int)((String)b).charAt(i)<curr) 
					{
						curr=((String)b).charAt(i);
					}
					b2+=curr;
					curr='z';
				}
			}
			
			return ((String)a).compareTo((String)b);
		}
		else 
		{
			return (Integer) null;
		}
	}

}
