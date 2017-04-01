package com.dhara;

import java.util.Scanner;

public class Travel
{
    private float miles;
    private float gallon;
    Scanner input = new Scanner(System.in);
    public Travel()
    {
        miles=0;
        gallon=0;
    }

    public float getGallon()
    {
        return gallon;
    }

    public void setGallon(float gallon)
    {
        this.gallon = gallon;
    }

    public float getMiles()
    {
        return miles;
    }

    public void setMiles(float miles)
    {
        this.miles = miles;
    }

    public void registerTrip()
    {

        System.out.println("-Trip-");
        System.out.print("Miles: \n");
        miles = input.nextFloat();
        System.out.print("Gallons: \n");
        gallon = input.nextFloat();
    }
}
