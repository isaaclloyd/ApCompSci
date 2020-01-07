package chp8;

public class CWHWDec4 {
    public static void main(String[] args)
    {
        
    	//RationalNumber stuff
    	RationalNumber n1 = new RationalNumber(1, 2);
        RationalNumber n2 = new RationalNumber(1, 4);
        
        System.out.println(n1.add(n2));
        System.out.println(n1.subtract(n2));
        System.out.println(n1.multiply(n2));
        System.out.println(n1.divide(n2));
        System.out.println();
        
        //Date stuff
        Date d = new Date(2000, 01, 01);
        d.addDays(79);
        d.addWeeks(3);
        System.out.println(d.toString());
        System.out.println(d.isLeapYear());
        
        //grocery stuff
        GroceryItemOrder i1 = new GroceryItemOrder("cookie", 100, 1.0);
        GroceryItemOrder i2 = new GroceryItemOrder("banana", 100000, 0.5);
        GroceryList l = new GroceryList();
        l.add(i1);
        l.add(i2);
        System.out.println(l.toString());
        
    }
}
