package chp9;

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) 
	{
		this.width=width;
		this.height=height;
	}
	public double getArea() 
	{
		return width*height;
	}
	public double getPerimeter() 
	{
		return 2.0*(width+height);
	}
	public double getWidth() 
	{
		return width;
	}
	public double getHeight() 
	{
		return height;
	}
	public boolean equals(Object o) 
	{
		if(o instanceof Rectangle) 
		{
			if(((Rectangle)o).getWidth()==width && ((Rectangle)o).getHeight()==height) 
			{
				return true;
			}
		}
		return false;
	}
}
