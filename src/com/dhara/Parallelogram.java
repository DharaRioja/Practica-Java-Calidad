package com.dhara;

public class Parallelogram extends Quadrilateral
{
    private int base,height;

    public Parallelogram(Point point)
    {
        this.point = point;
        base=point.getX_left()-point.getX_right();
        if(base<0)
        {
            base=base*(-1);
        }
        height=(base/2)+(base%2);

    }

    public float area()
    {
        return base*height;
    }

}
