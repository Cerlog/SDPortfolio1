package com.company;

public class Point {
    private double x; // Points x coordinate
    private double y; // Points y coordinate

    public Point(double x, double y) { // Constructor for the Points
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    } // Getter method for x coordinate
    public double getY() {
        return y;
    } // Getter method for x coordinate

    public static double distanceOfTwoPoints(Point a, Point b) { // distance between two points
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) +
                Math.pow(b.getY() - a.getY(),2));
    }
    public String toString() {
        return "[" + x + "," + y+ "]";
    } // Method for printing the point coordinate
}

