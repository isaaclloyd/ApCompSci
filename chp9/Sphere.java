package chp9;

public class Sphere extends CircularShapeWithHeight{
    private double radius;
    public Sphere(double r)
    {
        radius=r;
    }
    
    public double getVolume() {

        return (4/3)*Math.PI*radius*radius*radius;
    }
    public double getSurfaceArea() {
        return 4*Math.PI*radius*radius;
    }

}
