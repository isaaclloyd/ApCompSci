package chp9;

public class Circle implements Shape{
	private double radius;
	public Circle(double radius) 
	{
		this.radius=radius;
	}
	public double getArea() 
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter() 
	{
		return 2.0*Math.PI*radius;
	}
	public double getRadius() 
	{
		return radius;
	}
	public boolean equals(Object o) 
	{
		if(o instanceof Circle) 
		{
			if(((Circle)o).getRadius()==radius) 
			{
				return true;
			}
		}
		return false;
	}
}
