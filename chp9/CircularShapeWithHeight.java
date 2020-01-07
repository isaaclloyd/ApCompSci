package chp9;

public abstract class CircularShapeWithHeight implements ThreeDShape{
    private double radius;
    private double height;
    public abstract double getVolume();
    public abstract double getSurfaceArea();
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}