package chp3;

public class Project2 {
	public static void main(String[] args) 
	{
		compoundInterest(1000, 0.065, 100, 7);
	}
	public static void compoundInterest(double initial, double interest, double deposit, int years) 
	{
		double last = initial;
		double current = initial;
		for(int i = 1; i <= years; i++) 
		{
			System.out.print(i + "    ");
			System.out.print(last + "    ");
			System.out.print(interest+"    ");
			System.out.print(deposit+"    ");
			System.out.print(current + "    ");
			System.out.println();
			last = current;
			current = current+(current*interest)+deposit;
			interest = interest+(interest*interest);
			
			
			
		}
	}
}
