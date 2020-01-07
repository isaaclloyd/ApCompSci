package sports;

public abstract class Athlete {
	private String name;
	private String team;
	private int number;
	private double salary;
	public Athlete(String name, String team, int number, double salary) 
	{
		this.name=name;
		this.team=team;
		this.number=number;
		this.salary=salary;
	}
	public abstract void celebrate();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
