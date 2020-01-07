package chp9;

public class CD extends LibraryItem{
	private int id;
	private double lateFee;
	private double replacementCost;
	private String length;
	private String name;
	private String genre;
	public CD(int id, double lateFee, double replacementCost, String length, String name, String genre) 
	{
		this.id=id;
		this.lateFee=lateFee;
		this.replacementCost=replacementCost;
		this.length=length;
		this.name=name;
		this.genre=genre;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
