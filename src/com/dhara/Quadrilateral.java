package com.dhara;

public abstract class Quadrilateral
{
    protected Point point;

    public Quadrilateral()
    {
        point=null;
    }

    public Quadrilateral(Point point)
    {
        this.point = point;
    }

    public void show()
    {
        System.out.println("I'm a Quadrilateral!");

    }

    public abstract float area();
}
