package com.company;

public class Circle extends Shapes{ // Circle extending the Shape class
    private Point center;
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double x, double y, double r) { // Constructor for circle class
        center = new Point(x, y);
        if (r > 0) {                    // if radius entered to negative value
            this.radius = r;            // it is set to 0
        } else {
            this.radius = 0;
        }
    }
    @Override
    public Point returnCenter() {      // method for returning center for the circle
        return center;
    }

    public double getRadius() {
        return radius;
    }    // getter method for radius

    @Override
    public double area() {
        return PI*radius*radius;
    } // method for calculating area of circle

    @Override
    public double circumference() {
        return 2*PI*radius;
    } // method for calculating circumference

    @Override
    public boolean isPointInside(Point p1) {              // method for investigating whether point is inside
        if (Math.pow(p1.getX() -center.getX(),2) + Math.pow(p1.getY() - center.getY(),2) < radius*radius) { // calculation whether point is inside circle
            return true;
        } else if (Math.pow(p1.getX() -center.getX(),2) + Math.pow(p1.getY() - center.getY(),2) == radius*radius) { // calculation for whether point is on circle
            return true;
        }
        return false;                                          // if point is outside, method returns false
    }
}
