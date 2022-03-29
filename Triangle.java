package com.company;

public class Triangle extends Shapes{ // Triangle extending the Shape class
    private Point A;
    private Point B;
    private Point C;

    public Triangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) { //Constructor taking parameters for 6 x and y coordinates
        this.A = new Point(Ax, Ay);
        this.B = new Point(Bx, By);
        this.C = new Point(Cx, Cy);
    }

    @Override
    public Point returnCenter() {                                                    // method returning the center of triangle
        double centerX = (int) ((A.getX() + B.getX() + C.getX())/3);
        double centerY = (int) ((A.getY() + B.getY() + C.getY())/3);
        Point center = new Point(centerX,centerY);                                  // creates and returns a new point for center
        return center;
    }
    @Override
    public double area() {                                                              // method returning the area of triangle
        double area =  (((A.getX()*(B.getY()- C.getY()) +
                B.getX()*(C.getY()- A.getY())  +
                C.getX()*(A.getY()- B.getY()))/2));
        return area;
    }

    public double area(Point A, Point B, Point C) {                             // overloaded method of the area(), which is taking 3 parameters
        double area = A.getX() * (B.getY() - C.getY()) / 2 +                    // in order to eliminate reperitive code when using this method
                B.getX() * (C.getY() - A.getY()) / 2 +                          // for finding, whether point is inside or outside triangle
                C.getX() * (A.getY() - B.getY()) / 2;
        return area;
    }
    @Override
    public double circumference() {                                             // perimeter of the triangle
        double sideAB = Point.distanceOfTwoPoints(A,B);
        double sideBC = Point.distanceOfTwoPoints(C,B);
        double sideCA = Point.distanceOfTwoPoints(C,A);
        return sideAB + sideBC + sideCA;
    }
    @Override
    public boolean isPointInside(Point p1) {                                    // method detecting whether the point is inside or not
        double A1 = Math.abs(area(A,B,p1));
        double A2 = Math.abs(area(A, p1, C));
        double A3 = Math.abs(area(A,C,p1));
        double areaWithPoint = A1 + A2 + A3;
        if (areaWithPoint == area()) return true;                               // if point inside, return true
        return false;                                                           // if not, return false
    }
}
