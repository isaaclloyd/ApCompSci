package chp9;

public class MinMaxAccount extends BankAccount{
    private int balance;
    private int min;
    private int max;
    
    public MinMaxAccount(Startup s)
    {
        super(s);
        min=balance;
        max=balance;
    }
    public void withdrawal(Debit d)
    {
        super.withdrawal(d);
        minMax();
    }
    public void deposit(Credit c)
    {
        super.deposit(c);
        minMax();
    }
    public void minMax()
    {
        if(balance<min)
        {
            min=balance;
        }
        if(balance>max)
        {
            max=balance;
        }
    }
    public double getMin()
    {
        
    	return min;
    }
    public double getMax()
    {  
    	return max;
    }
}