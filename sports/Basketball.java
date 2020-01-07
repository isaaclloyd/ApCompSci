package sports;

public class Basketball extends Athlete{
	private double freeThrow;
	public Basketball(String name, String team, int number, double salary, double freeThrow) 
	{
		super(name, team, number, salary);
		this.freeThrow=freeThrow;
		
	}
	public void celebrate() 
	{
		System.out.println("insert pop culture reference here");
	}
	public double getFreeThrow() {
		return freeThrow;
	}

	public void setFreeThrow(double freeThrow) {
		this.freeThrow = freeThrow;
	}
	
}
