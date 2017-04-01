package com.dhara;

public class HugeInteger
{
    private int[] number;

    public HugeInteger()
    {
        number=new int[40];
        for(int i=0;i<40;i++)
        {
            number[i]=-1;
        }
    }

    public void parse(String n)
    {
        int s=n.length();
        for(int i=0;i<s;i++)
        {
            number[i]=(int) (n.charAt(i) - 48);
        }

        /*for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
                System.out.printf("%d",number[i]);
        }*/
    }

    public String toString()
    {
        String n="";
        for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
            {
                n=n+String.valueOf(number[i]);
            }
        }
        return n;
    }

    public int add(HugeInteger a)
    {
        int n1=0,n2=0;

        for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
            {
                n1=(n1+number[i])*10;
            }
            if(a.number[i]!=-1)
            {
                n2=(n2+a.number[i])*10;
            }
        }
        n1=n1/10;
        n2=n2/10;
        return (n1+n2);
    }

    public int subtract(HugeInteger a)
    {
        int cont1=0,cont2=0,n1=0,n2=0;

        for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
            {
                cont1++;
            }
            if(a.number[i]!=-1)
            {
                cont2++;
            }
        }

        for(int i=0;i<cont1;i++)
        {
            n1=(n1+number[i])*10;
        }
        n1=n1/10;
        for(int i=0;i<cont2;i++)
        {
            n2=(n2+a.number[i])*10;
        }
        n2=n2/10;
        return n1-n2;

    }

    public boolean isEqualTo(HugeInteger a)
    {
        String n1=this.toString();
        String n2=a.toString();
        boolean r=false;
        if(n1.equals(n2)==true)
        {
            r=true;
        }
        return r;
    }

    public boolean isNotEqualTo(HugeInteger a)
    {
        String n1=this.toString();
        String n2=a.toString();
        boolean r=false;
        if(n1.equals(n2)==false)
        {
            r=true;
        }
        return r;
    }

    public boolean isGreaterThan(HugeInteger a)
    {
        boolean r=false;
        int cont1=0,cont2=0,n1=0,n2=0;

        for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
            {
                cont1++;
            }
            if(a.number[i]!=-1)
            {
                cont2++;
            }
        }

        for(int i=0;i<cont1;i++)
        {
            n1=(n1+number[i])*10;
        }
        n1=n1/10;
        for(int i=0;i<cont2;i++)
        {
            n2=(n2+a.number[i])*10;
        }
        n2=n2/10;

        if(n1>n2)
        {
            r=true;
        }
        return r;
    }

    public boolean isLessThan(HugeInteger a)
    {
        boolean r=false;
        int cont1=0,cont2=0,n1=0,n2=0;

        for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
            {
                cont1++;
            }
            if(a.number[i]!=-1)
            {
                cont2++;
            }
        }

        for(int i=0;i<cont1;i++)
        {
            n1=(n1+number[i])*10;
        }
        n1=n1/10;
        for(int i=0;i<cont2;i++)
        {
            n2=(n2+a.number[i])*10;
        }
        n2=n2/10;
        if(n1<n2)
        {
            r=true;
        }
        return r;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger a)
    {
        boolean r=false;
        int cont1=0,cont2=0,n1=0,n2=0;

        for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
            {
                cont1++;
            }
            if(a.number[i]!=-1)
            {
                cont2++;
            }
        }

        for(int i=0;i<cont1;i++)
        {
            n1=(n1+number[i])*10;
        }
        n1=n1/10;
        for(int i=0;i<cont2;i++)
        {
            n2=(n2+a.number[i])*10;
        }
        n2=n2/10;
        if(n1>=n2)
        {
            r=true;
        }
        return r;

    }

    public boolean isLessThanOrEqualTo(HugeInteger a)
    {
        boolean r=false;
        int cont1=0,cont2=0,n1=0,n2=0;

        for(int i=0;i<40;i++)
        {
            if(number[i]!=-1)
            {
                cont1++;
            }
            if(a.number[i]!=-1)
            {
                cont2++;
            }
        }

        for(int i=0;i<cont1;i++)
        {
            n1=(n1+number[i])*10;
        }
        n1=n1/10;
        for(int i=0;i<cont2;i++)
        {
            n2=(n2+a.number[i])*10;
        }
        n2=n2/10;
        if(n1<=n2)
        {
            r=true;
        }
        return r;
    }

    public boolean isZero()
    {
        if(number[0]==0)
            return true;
        else
            return false;
    }

}
