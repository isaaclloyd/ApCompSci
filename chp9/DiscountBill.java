package chp9;

public class DiscountBill extends GroceryBill{
    private double total=0;
    private boolean dis;
    private int num=0;
    private double totalDis=0;
    public DiscountBill(Employee clerk, boolean dis)
    {
        super(clerk);
        this.dis=dis;
    }
    public void add(Item i)
    {
        if(dis && i.getDiscount()>0){
            total+=i.getPrice()-i.getDiscount();
            num++;
            totalDis+=i.getDiscount();
            
        }
        else
        {
            total+=i.getPrice();
        }
    }
    public int getDiscountCount() 
    {
    	return num;
    }
    public double getDiscountAmount() 
    {
    	return totalDis;
    }
    public double getDiscountPercent() 
    {
    	return totalDis/total;
    }
     
}