package com.dhara;

public class Trapezoid extends Quadrilateral
{
    private int base1,base2,height;

    public Trapezoid(Point point)
    {
        this.point = point;
        base1=point.getX_left()-point.getX_right();
        if(base1<0)
        {
            base1=base1*(-1);
        }
        base2=point.getY_left()-point.getY_right();
        if(base2<0)
        {
            base2=base2*(-1);
        }
        height=base1;

    }

    public float area()
    {
        return ((1/2)*(base1+base2)*height);
    }

}
