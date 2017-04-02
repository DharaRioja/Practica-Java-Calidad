package com.dhara;

public class Factorial
{
    private int number;

    public Factorial(int number)
    {
        this.number = number;
    }

    public int factorial()
    {
        int f=1;
        for(int i=1;i<=number;i++)
        {
            f=f*i;
        }
        return f;
    }

    public int factorialN(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    public int constant_e()
    {
        int e=1;
        for(int i=1;i<=number;i++)
        {
            e=e+(1/factorialN(i));
        }
        return e;
    }

    public int constant_e_x()
    {
        int e=1;
        for(int i=1;i<=number;i++)
        {
            e=e+((int)Math.pow(i,i)/factorialN(i));
            
        }
        return e;
    }
}
