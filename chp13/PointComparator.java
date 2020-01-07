package chp13;

import java.awt.Point;
import java.util.Comparator;

public class PointComparator implements Comparator{

	public int compare(Object a, Object b) 
	{
		if(a instanceof Point && b instanceof Point) 
		{
			double aXDis=Math.abs(((Point)a).getX());
			double aYDis=Math.abs(((Point)a).getY());
			double bXDis=Math.abs(((Point)b).getX());
			double bYDis=Math.abs(((Point)b).getY());
			
			double aDis=Math.sqrt(aXDis*aXDis+aYDis*aYDis);
			double bDis=Math.sqrt(bXDis*bXDis+bYDis*bYDis);
			
			return (int) Math.round(aDis-bDis);
			
		}
		else 
		{
			return (Integer) null;
		}
	}

}
