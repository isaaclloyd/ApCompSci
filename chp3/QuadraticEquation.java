package chp3;

public class QuadraticEquation {
    public static void main(String[] args)
    {
        quadEquation(1, -7, 12);
    }
    public static void quadEquation(double a, double b, double c)
    {
        System.out.println(((-(b)+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a))); 
        System.out.println(((-(b)-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a)));
    }
}
