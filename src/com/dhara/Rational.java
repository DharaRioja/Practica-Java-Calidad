package com.dhara;

public class Rational
{
    private int numerator;
    private int denominator;
    private static int n,d;
    public Rational(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Rational()
    {
        numerator = 1;
        denominator = 2;
    }

    public void reduce()
    {
        for(int i=2;i<numerator;i++)
        {
            if(numerator%i==0 && denominator%i==0)
            {
                numerator=numerator/i;
                denominator=denominator/i;
            }
        }

        for(int i=2;i<denominator;i++)
        {
            if(numerator%i==0 && denominator%i==0)
            {
                numerator=numerator/i;
                denominator=denominator/i;
            }
        }
       // System.out.printf("%d/%d \n",numerator,denominator);
    }

    public static  void add(int n1,int d1, int n2,int d2)
    {
        int m=d1*d2;
        n=(n1*(m/d1))+(n2*(m/d2));
        d=m;
    }

    public static void subtract(int n1,int d1, int n2,int d2)
    {
        int m=d1*d2;
        n=(n1*(m/d1))-(n2*(m/d2));
        d=m;
    }

    public static void multiply(int n1,int d1, int n2,int d2)
    {
        n=n1*n2;
        d=d1*d2;
    }

    public static void divide(int n1,int d1, int n2,int d2)
    {
        n=n1*d2;
        d=d1*n2;
    }

    public static void reduce_static()
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0 && d%i==0)
            {
                n=n/i;
                d=d/i;
            }
        }

        for(int i=2;i<d;i++)
        {
            if(n%i==0 && d%i==0)
            {
                n=n/i;
                d=d/i;
            }
        }
        System.out.printf("The result is: %d/%d \n",n,d);
    }

    public String convert()
    {
        String n=String.valueOf(numerator)+"/"+String.valueOf(denominator);
        return n;
    }

    public String decimal(int d)
    {
        int c=(int) Math.pow(10,d);
        double n= Math.rint((numerator/denominator)*c)/c;
        String r=String.valueOf(n);
        return r;
    }

}
