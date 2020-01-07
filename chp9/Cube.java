package chp9;

public class Cube implements ThreeDShape{
	private double side;
	
	public Cube(double side) 
	{
		this.side=side;
	}
	
	public double getVolume() 
	{
		return side*side*side;
	}
	public double getSurfaceArea() 
	{
		return side*side*6;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
}
