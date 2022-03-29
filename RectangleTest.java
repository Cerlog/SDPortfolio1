package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void areaTest() { // test the area of rectangle
        Rectangle r1 = new Rectangle(-3,0,5,0,5,5,-3,5);
        assertEquals(r1.area(),40,.1);
    }
    @Test
    public void circumferenceTest() { // test the area of rectangle
        Rectangle r1 = new Rectangle(-3,0,5,0,5,5,-3,5);
        assertEquals(r1.circumference(),26,.1);
    }
    @Test
    public void isPointInsideTest1() { // test for point is inside of the rectanglge
        Rectangle r1 = new Rectangle(-3,0,5,0,5,5,-3,5);
        Point p1 = new Point(-2,3);
        assertTrue(r1.isPointInside(p1));
    }
    @Test
    public void isPointInsideTest2() { // point is on the side of rectangle
        Rectangle r1 = new Rectangle(-3,0,5,0,5,5,-3,5);
        Point p1 = new Point(-3,3);
        assertTrue(r1.isPointInside(p1));
    }
    @Test
    public void isPointInsideTest3() { // Test for point outside of rectangle
        Rectangle r1 = new Rectangle(-3,0,5,0,5,5,-3,5);
        Point p1 = new Point(-4,3);
        assertFalse(r1.isPointInside(p1));
    }
    @Test
    public void testDistanceCenterToCenter() { //testing the distance between two rectangles with the same center
        Rectangle r1 = new Rectangle(-2,-5,2,-4,2,4,-2,4);
        Rectangle r2 = new Rectangle(-2,-5,2,-4,2,4,-2,4);
        assertEquals(0, Point.distanceOfTwoPoints(r1.returnCenter(),r2.returnCenter()),.1);
    }
    @Test
    public void testDistanceCenterToCenter2() { //testing the distance between two rectangles with the different center
        Rectangle r1 = new Rectangle(-2,-5,2,-4,2,4,-2,4);
        Rectangle r2 = new Rectangle(-7.5,-1.5,-6,-1.5,-6,1,-7.5,1);
        assertEquals(6.75, Point.distanceOfTwoPoints(r1.returnCenter(),r2.returnCenter()),.1);
    }
}
