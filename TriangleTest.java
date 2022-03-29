package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void testArea() { // test of the area calculation
        Triangle t1 = new Triangle(-3,0,3,0,0,6);
        assertEquals(t1.area(), 18,.1);
    }
    @Test
    public void testCircumference() { // test of the circumference calculation
        Triangle t1 = new Triangle(-3,0,3,0,0,6);
        assertEquals(t1.circumference(), 19.416, .1);
    }
    @Test
    public void isPointInside1() { // test, when point is inside
        Triangle t1 = new Triangle(-3,0,3,0,0,6);
        Point p1 = new Point(0,2);
        assertEquals(true,t1.isPointInside(p1));
    }
    @Test
    public void isPointInside2() { // test, when point is outside
        Triangle t1 = new Triangle(-3,0,3,0,0,5);
        Point p1 = new Point(-10,-10);
        assertFalse(t1.isPointInside(p1));
    }
    @Test
    public void testDistanceCenterToCenter() { //testing the distance between two triangles with the same center
        Triangle t1 = new Triangle(-2,0,2,0,0,3);
        Triangle t2 = new Triangle(-2,0,2,0,0,3);
        assertEquals(0, Point.distanceOfTwoPoints(t1.returnCenter(),t2.returnCenter()),.1);
    }
    @Test
    public void testDistanceCenterToCenter2() { //testing the distance between two rectangles with the different center
        Triangle t1 = new Triangle(-2,0,2,0,0,3);
        Triangle t2 = new Triangle(-4.01,0,4,0,0,9);
        assertEquals(2, Point.distanceOfTwoPoints(t1.returnCenter(),t2.returnCenter()),.1);
    }
}
