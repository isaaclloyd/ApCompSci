package chp8;

public class StudentDriver {
	public static void main(String[] args) 
	{
		Student senior001 = new Student();
		System.out.println(senior001.toString());
		Student frosh001= new Student("smart", "boi", 5.1, 786);
		System.out.println(frosh001.toString());
	}
}
