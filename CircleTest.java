package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void testOfCircleConstructor() { // if negative radius, should be set to 0
        Circle c1 = new Circle(1,1,-1);
        assertEquals(0,c1.getRadius(),.1);
    }
    @Test
    public void testPointInside1() { // Point in the center of circle
        Circle c1 = new Circle(0,0,5);
        Point p1 = new Point(0,0);
        assertEquals(true, c1.isPointInside(p1));
    }
    @Test
    public void testPointInside2() { // Pont inside of circle
        Circle c1 = new Circle(0,0,5);
        Point p1 = new Point(0,1);
        assertEquals(true, c1.isPointInside(p1));
    }
    @Test
    public void testPointInside3() { // Point on the boarder
        Circle c1 = new Circle(0,0,5);
        Point p1 = new Point(0,5);
        assertEquals(true, c1.isPointInside(p1));
    }
    @Test
    public void testPointOutside() { // Point on the boarder
        Circle c1 = new Circle(0,0,5);
        Point p1 = new Point(0,6);
        assertEquals(false,c1.isPointInside(p1));
    }
    @Test
    public void testArea() {
        Circle c1 = new Circle(0,0,5);
        assertEquals(78.5398163, c1.area(),.1);
    }
    @Test
    public void testCircumference() {
        Circle c1 = new Circle(0,0,5);
        assertEquals(31.4159265, c1.circumference(),.1);
    }
    @Test
    public void testDistanceCenterToCenter() { //testing the distance between two circles with the same center
        Circle c1 = new Circle(0,0,5);
        Circle c2 = new Circle(0,0,2);
        assertEquals(0, Point.distanceOfTwoPoints(c1.returnCenter(),c2.returnCenter()),.1);
    }
    @Test
    public void testDistanceCenterToCenter2() { //testing the distance between two circles with the different center
        Circle c1 = new Circle(5,5,5);
        Circle c2 = new Circle(0,0,2);
        assertEquals(7.07, Point.distanceOfTwoPoints(c1.returnCenter(),c2.returnCenter()),.1);
    }
}
