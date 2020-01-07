package practice;

import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;
	public Digits(int num) 
	{
		digitList=new ArrayList<>();
		for(int i = 0; i<Integer.toString(num).length(); i++) 
		{
			digitList.add(Integer.parseInt(Character.toString(Integer.toString(num).charAt(i))));
		}
	}
	public ArrayList<Integer> getDigitList() 
	{
		return digitList;
	}
	public boolean isStrictlyIncreasing() 
	{
		for(int i=0; i<digitList.size()-1; i++) 
		{
			if(digitList.get(i)>=digitList.get(i+1)) 
			{
				return false;
			}
		}
		return true;
	}
}
