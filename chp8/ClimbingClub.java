package chp8;

import java.util.ArrayList;

public class ClimbingClub
{
	private ArrayList<ClimbInfo> climbList;
	public ClimbingClub() 
	{
		climbList=new ArrayList<ClimbInfo>();
	}
	public void addClimb(String peakName, int climbTime) 
	{
		climbList.add(new ClimbInfo(peakName, climbTime));
	}
	public int distinctPeakNames() 
	{ 
		if (climbList.size() == 0) 
		{ 
				return 0; 
		} 

		ClimbInfo currInfo = climbList.get(0); 
		String prevName = currInfo.getName(); 
		String currName = null; 
		int numNames = 1; 

		for (int k = 1; k < climbList.size(); k++) 
		{ 
			currInfo = climbList.get(k); 
			currName = currInfo.getName(); 
			if (prevName.compareTo(currName) != 0) 
			{ 
				numNames++; 
				prevName = currName; 
			} 
		} 
		return numNames; 
	}

}
