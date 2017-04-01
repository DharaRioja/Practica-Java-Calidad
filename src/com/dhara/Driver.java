package com.dhara;

public class Driver
{
    private String name;
    private Travel[] travels;

    public Driver()
    {
        name=" ";
        travels=new Travel[10];
        for(int i=0;i<10;i++)
        {
            travels[i]=new Travel();
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Travel[] getTravels()
    {
        return travels;
    }

    public void setTravels(Travel[] travels)
    {
        this.travels = travels;
    }

    public void registerTravels()
    {
        for (int i=0; i<3 ;i++)
        {
            travels[i].registerTrip();
        }
    }

   public void report()
    {
        float avg1=0;
        float avg2=0;
        for (int i=0; i<3;i++)
        {
            avg1=travels[i].getMiles();
            avg2=travels[i].getGallon();
            System.out.printf("Trip %d:  %.2f Miles/Gallon %n",i,travels[i].getMiles()/travels[i].getGallon());
        }
        System.out.printf("Travels  %.2f Miles/Gallon %n", (avg1/avg2));

    }
}
