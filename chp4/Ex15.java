package chp4;

public class Ex15 {
public static void main(String[] args)
{
	System.out.println(getGrade(63));
}
public static double getGrade(int grade) 
{
	if(grade<60) 
	{
		return 0.0;
	}
	else if(grade >= 95) 
	{
		return 4.0;
	}
	else if(grade <= 62 && grade >= 60) 
	{
		return 0.7;
	}
	else
	{
		return 0.8+(grade-63)/10.0;
	}
}

}


