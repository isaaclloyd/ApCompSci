package chp8;

public class GroceryList {
	private GroceryItemOrder[] list;
	public int length;
	public GroceryList() 
	{
		list = new GroceryItemOrder[10];
		length=0;
	}
	public void add(GroceryItemOrder item) 
	{
		list[length]=item;
		length++;
	}
	public double getTotalCost() 
	{
		double total=0.0;
		for(int i = 0; i<list.length; i++) 
		{
			if(list[i]==null) 
			{
				break;
			}
			total+=list[i].getCost();
		}
		return total;
	}
	public String toString() 
	{
		String result="The grocery list contains: \n";
		for(int i = 0; i<list.length; i++) 
		{
			if(list[i]==null) 
			{
				break;
			}
			result+=list[i].toString()+", \n";
		}
		result+="The total cost is "+this.getTotalCost();
		return result;
	}
}
