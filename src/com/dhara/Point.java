package com.dhara;

public class Point
{
    int x_right,x_left,y_right,y_left;

    public Point(int x_right, int x_left, int y_right, int y_left)
    {
        this.x_right = x_right;
        this.x_left = x_left;
        this.y_right = y_right;
        this.y_left = y_left;
    }

    public int getX_right() {
        return x_right;
    }

    public void setX_right(int x_right) {
        this.x_right = x_right;
    }

    public int getX_left() {
        return x_left;
    }

    public void setX_left(int x_left) {
        this.x_left = x_left;
    }

    public int getY_right() {
        return y_right;
    }

    public void setY_right(int y_right) {
        this.y_right = y_right;
    }

    public int getY_left() {
        return y_left;
    }

    public void setY_left(int y_left) {
        this.y_left = y_left;
    }
}
