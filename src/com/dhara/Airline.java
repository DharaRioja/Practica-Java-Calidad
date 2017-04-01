package com.dhara;

public class Airline
{
    private boolean[] plane;
    int fc,ec;
    public Airline()
    {
        plane = new boolean[11];
        for(int i=1;i<11;i++)
        {
            plane[i]=false;
        }
        fc=0;
        ec=0;
    }

    public boolean First_Class()
    {
        boolean resp=false;
        boolean i=false;
        while(i==false)
        {
            int random=(int)(Math.random()*5+1);
            if(random<6)
            {
                if (plane[random] == false && fc < 6) {
                    System.out.printf("Seat number %d \n", random);
                    plane[random] = true;
                    fc++;
                    i = true;
                    resp = true;
                } else {
                    if (fc == 5) {
                        i = true;
                    }
                }
            }
        }
        return resp;
    }

    public boolean Economy_Class()
    {
        boolean resp=false;
        boolean i=false;
        while(i==false)
        {
            int random = (int) (Math.random()*10+6);
            if(random<11)
            {
                if (plane[random] == false && ec < 6) {
                    System.out.printf("Seat number %d \n", random);
                    plane[random] = true;
                    ec++;
                    i = true;
                    resp = true;
                } else {
                    if (ec == 5) {
                        i = true;
                    }
                }
            }
        }
        return resp;
    }
}
