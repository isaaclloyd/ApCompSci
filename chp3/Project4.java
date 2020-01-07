package chp3;

import java.util.Scanner;

public class Project4 {
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		triangleAngles(scan);
	}
	public static void triangleAngles(Scanner scan) 
	{
		System.out.println("input side lengths of sides a b and c of a triangle: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double hyp = Math.max(a, Math.max(b, c));
		double angleA = (180/Math.PI)*Math.acos((Math.pow(a, 2)-Math.pow(b, 2)-Math.pow(c, 2))/(-2*b*c));
		double angleB = (180/Math.PI)*Math.acos((Math.pow(b, 2)-Math.pow(a, 2)-Math.pow(c, 2))/(-2*a*c));
		double angleC = (180/Math.PI)*Math.acos((Math.pow(c, 2)-Math.pow(a, 2)-Math.pow(b, 2))/(-2*a*b));
		System.out.println("Angle A = "+angleA);
		System.out.println("Angle B = "+angleB);
		System.out.println("Angle C = "+angleC);
	}
}
