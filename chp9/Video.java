package chp9;

public class Video extends LibraryItem{
	private int id;
	private double lateFee;
	private double replacementCost;
	private String length;
	private String name;
	
	public Video(int id, double lateFee, double replacementCost, String length, String name) 
	{
		this.id=id;
		this.lateFee=lateFee;
		this.replacementCost=replacementCost;
		this.length=length;
		this.name=name;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
