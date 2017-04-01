package com.dhara;

public class IntegerSet
{
    private boolean[] set;
    private static boolean[] set_s;
    private String cadena="";
    public IntegerSet()
    {
        set=new boolean[101];
        set_s=new boolean[101];
        for(int i=0;i<101;i++)
        {
            set[i]=false;
        }
    }

    public void insertElement(int i)
    {
        set[i]=true;
    }

    public void deleteElement(int i)
    {
        set[i]=false;
    }

    public String toString()
    {
    	StringBuilder miString = new StringBuilder();
    	miString = miString.append(cadena);
    	
        boolean empty=false;
      
        for(int i=0;i<101;i++)
        {
            if(set[i]==true)
            {
                empty=true;
                i=101;
            }
        }

        if(empty!=false)
        {
            for(int i=0;i<101;i++)
            {
                if(set[i]==true)
                {
                    miString = miString.append(i+" ");
                }
            }
            return miString.toString();
        }
        else
        {
        	miString.delete(0, miString.length());
            return miString.append("---").toString();
        }

    }

    public boolean  isEqualTo(IntegerSet a)
    {
        boolean r=false;
        String one=this.toString();
        String two=a.toString();

        if(one.equals(two)==true)
        {
            r=true;
        }
        return r;
    }

    public boolean getI(int i)
    {
        return set[i];
    }

    public static void union(int i)
    {
        set_s[i]=true;
    }

    public static void intersection(int i)
    {
        set_s[i]=false;
    }

    public static void showSet_s()
    {
        for(int i=0;i<101;i++)
        {
            System.out.printf("%d, %b %n",i,set_s[i]);
        }
    }

}
