package com.dhara;

public class Rectangle extends Quadrilateral
{
    private int base,height;

    public Rectangle(Point point)
    {
        this.point = point;
        base=point.getX_left()-point.getX_right();
        if(base<0)
        {
            base=base*(-1);
        }
        height=point.getX_left()-point.getY_left();

    }

    public float area()
    {
        return base*height;

    }

}
