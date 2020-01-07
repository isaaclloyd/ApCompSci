package chp9;

public class Cylinder extends CircularShapeWithHeight{

    private double height;
    private double radius;
    
    public Cylinder(double h, double r)
    {
        height=h;
        radius=r;
    }
    public double getVolume() {
        return Math.PI*radius*radius*height;
    }

    public double getSurfaceArea() {
        
        return height*Math.PI*2*radius+Math.PI*radius*radius;
    }
    
}