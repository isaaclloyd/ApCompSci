package chp8;

public class Student {
	private String first;
	private String last;
	private double gpa;
	private int credits;
	
	public Student() 
	{
		first="Some ";
		last="kid ";
		gpa=0.0;
		credits=0;
	}
	public Student(String first, String last, double gpa, int credits) 
	{
		this.first=first+" ";
		this.last=last+ " ";
		this.gpa=gpa;
		this.credits=credits;
	}
	public String toString() 
	{
		return "Student "+first+last+"has "+credits+" credits and a "+gpa+" gpa";
	}
}
