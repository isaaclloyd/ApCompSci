package sports;

public class Soccer extends Athlete{
	private double kick;
	
	public Soccer(String name, String team, int number, double salary, double kick) 
	{
		super(name, team, number, salary);
		this.kick=kick;
	}
	public void celebrate() 
	{
		System.out.println("GOALLLLLLLL!!!!!!!!!!!!!!!!!!!!!!");
	}
	public double getKick() {
		return kick;
	}

	public void setKick(double kick) {
		this.kick = kick;
	}
}
