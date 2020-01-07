package chp8;

public class GroceryItemOrder {
	private String itemName;
	private int quantity;
	private double pricePerUnit;
	
	public GroceryItemOrder(String name, int amount, double cost) 
	{
		itemName=name;
		quantity=amount;
		pricePerUnit=cost;
	}
	
	public double getCost() 
	{
		return pricePerUnit*quantity;
	}
	
	public void setQuantity(int amount) 
	{
		quantity=amount;
	}

	public String toString() 
	{
		return quantity+" "+itemName+"s costing "+this.getCost();
	}
}
