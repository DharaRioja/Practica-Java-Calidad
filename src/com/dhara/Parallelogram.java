package com.dhara;

public class Parallelogram extends Quadrilateral
{
    private int base;
    private float height;

    public Parallelogram(Point point)
    {
    	float baseFloat;
        this.point = point;
        base=point.getX_left()-point.getX_right();
        if(base<0)
        {
            base=base*(-1);
        }
        baseFloat = base;
        height=(baseFloat/2)+(baseFloat%2);

    }

    public float area()
    {
        return base*height;
    }

}
