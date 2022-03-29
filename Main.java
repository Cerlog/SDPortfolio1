package com.company;


public class Main {

    public static void main(String[] args) {
            Triangle t1 = new Triangle(-3,0,3,0,0,6);
            Point p1 = new Point(0,2);
            System.out.println(t1.isPointInside(p1));

    }
}
