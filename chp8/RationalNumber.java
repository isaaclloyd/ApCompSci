package chp8;

public class RationalNumber {
    private int numerator;
    private int denominator;
    
    public RationalNumber(int num, int den)
    {
        if(den==0)
        {
            throw new IllegalArgumentException();
        }
        numerator=num;
        denominator=den;
    }
    
    public RationalNumber()
    {
        numerator=0;
        denominator=1;
    }
    
    public int getNumerator()
    {
        return numerator;
        
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public RationalNumber add(RationalNumber n)
    {
        int num = n.getNumerator()*denominator;
        int den = n.getDenominator()*denominator;
        RationalNumber n1 = new RationalNumber(num+numerator*n.getDenominator(), den);
        n1.simplify();
        return n1;
    }
    public RationalNumber subtract(RationalNumber n)
    {
        int num = n.getNumerator()*denominator;
        int den = n.getDenominator()*denominator;
        RationalNumber n1 = new RationalNumber(numerator*n.getDenominator()-num, den);
        n1.simplify();
        return n1;
    }
    public RationalNumber multiply(RationalNumber n)
    {
        RationalNumber n1 = new RationalNumber(n.getNumerator()*numerator, n.getDenominator()*denominator);
        n1.simplify();
        return n1;
    }
    public RationalNumber divide(RationalNumber n)
    {
        RationalNumber n1 = new RationalNumber(n.getDenominator()*numerator, n.getNumerator()*denominator);
        n1.simplify();
        return n1;
    }
    public String toString()
    {
        if(denominator==1)
        {
            return numerator+"";
        }
        return numerator+"/"+denominator;
    }
    public void simplify()
    {
            for(int i = 2; i<=numerator; i++)
            {
                if(numerator%i==0 && denominator%i==0)
                {
                    numerator/=i;
                    denominator/=i;
                }
            }
    }
}