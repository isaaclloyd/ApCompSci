package chp9;

public class Octagon implements Shape{
	private double side;
	public Octagon(double side) 
	{
		this.side=side;
	}
	public double getArea() 
	{
		return 2*(1+Math.sqrt(2.0))*(side*side);
	}
	public double getPerimeter() 
	{
		return side*8;
	}
	public double getSide() 
	{
		return side;
	}
	public boolean equals(Object o) 
	{
		if(o instanceof Octagon) 
		{
			if(((Octagon)o).getSide()==side) 
			{
				return true;
			}
		}
		return false;
	}
}
