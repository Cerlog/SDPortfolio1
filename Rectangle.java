package com.company;

public class Rectangle extends Shapes{ // Rectangle extending the shape class
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Rectangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy, double Dx, double Dy) { // constructor for Rectangle, that takes 8 x and y coordinates
        this.A = new Point(Ax, Ay);
        this.B = new Point(Bx, By);
        this.C = new Point(Cx, Cy);
        this.D = new Point(Dx, Dy);
    }

    @Override
    public Point returnCenter() { // method returning the center of rectangle
        double centerX = ((A.getX() + B.getX() + C.getX() + D.getX())/4);
        double centerY = ((A.getY() + B.getY() + C.getY() + D.getY())/4);
        Point center = new Point(centerX,centerY);
        return center;
    }
    @Override
    public double area() {   // method for returning the area of rectangle
        double A1 = A.getX() * (B.getY() - D.getY()) / 2
                + B.getX() * (D.getY() - A.getY()) / 2
                + D.getX() * (A.getY() - B.getY()) / 2;
        double A2 = D.getX() * (B.getY() - C.getY()) / 2
                + B.getX() * (C.getY() - D.getY()) / 2
                + C.getX() * (D.getY() - B.getY()) / 2;
        return A1 + A2;
    }

    double area(Point A, Point B, Point p1) {               // overloaded method of the area(), which is taking 3 parameters
        double A1 = A.getX() * (B.getY() - p1.getY()) / 2   // in order to elimitnate repetitive ode when using this method
                + B.getX() * (p1.getY() - A.getY()) / 2     // for finding, whether point is inside or outside rectangle
                + p1.getX() * (A.getY() - B.getY()) / 2;
        return Math.abs(A1);
    }
    @Override
    public double circumference() {                         // perimeter of rectangle
        double length = Point.distanceOfTwoPoints(A,B);
        double width =  Point.distanceOfTwoPoints(B,C);
        return 2*length + 2*width;
    }
    @Override
    public boolean isPointInside(Point p1) {               // method detecting whether the point is inside or not
        double A1 = Math.abs(area(A,D,p1));
        double A2 = Math.abs(area(D,C,p1));
        double A3 = Math.abs(area(C,B,p1));
        double A4 = Math.abs(area(p1,B,A));
        double areaWithPoint = A1+A2+A3+A4;
        if (areaWithPoint == this.area()) return true;      // if point inside, return true
        return false;                                       // if not, return false
    }
}
