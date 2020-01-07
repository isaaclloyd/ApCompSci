package chp9;

public class Book extends LibraryItem{
	private int id;
	private double lateFee;
	private double replacementCost;
	private String name;
	private String author;
	
	public Book(int id, double lateFee, double replacementCost, String name, String author) 
	{
		this.id=id;
		this.lateFee=lateFee;
		this.replacementCost=replacementCost;
		this.name=name;
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
