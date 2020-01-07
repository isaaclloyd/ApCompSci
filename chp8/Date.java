package chp8;

import java.util.TimeZone;

public class Date {
    public static final int[] YEAR = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
    private int year;
    private int month;
    private int day;
    
    public Date(int year, int month, int day)
    {
        this.setYear(year);
        this.month=month;
        this.day=day;
    }
    public Date()
    {
        this(1970, 01, 01); 
        int daysSinceEpoch=(int)((System.currentTimeMillis()+TimeZone.getDefault().getRawOffset())/100/60/60/24);
        addDays(daysSinceEpoch);
        
    }
    public void addWeeks(int weeks) 
    {
    	this.addDays(weeks*7);
    }
    public void addDays(int days)
    {
    	if(days>YEAR[month-1]) 
    	{
    		day-=YEAR[month-1]-day;
    		if(month!=12) 
    		{
    			month++;
    		}
    		else
    		{
    			year++;
    			month=1;
    		}
    	}
    	
    	day+=days;
    	int add=(int)(Math.floor(day/365.241898));
    	setYear(getYear() + add);
    	day-=(int)(Math.floor(add*365.241898));
    	int i = month;
    	while(day>YEAR[i]) 
    	{
    		day-=YEAR[i];
    		
    		if(month!=12)
    		{
    			month++;
    		}
    		else
    		{
    			year++;
    			month=1;
    		}
    			
    		i++;
    		if(i>11) 
    		{
    			i=0;
    		}
    	}
    }
    public boolean isLeapYear() 
    {
    	if(year%4==0 && year%100!=0) 
    	{
    		return true;
    	}
    	else if(year%400==0) 
    	{
    		return true;
    	}
    	return false;
    }
    public String toString() 
    {
    	return month+"-"+day+"-"+year;
    }
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}
