package chp9;

public class Triangle implements Shape{
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) 
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public getArea() 
	{
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double getPerimeter() 
	{
		return a+b+c;
	}
	public double getA() 
	{
		return a;
	}
	public double getB() 
	{
		return b;
	}public double getC() 
	{
		return c;
	}
	public boolean equals(Object o) 
	{
		if(o instanceof Triangle) 
		{
			if(((Triangle)o).getA()==a && ((Triangle)o).getB()==b && ((Triangle)o).getC()==c)
			{
				return true;
			}
		}
		return false;
	}
}
