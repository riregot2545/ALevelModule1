package com.nix;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void findAreaZero() {
        Triangle.Point pointA = new Triangle.Point(4, 4);
        Triangle.Point pointB = new Triangle.Point(4, 4);
        Triangle.Point pointC = new Triangle.Point(4, 4);

        assertEquals(0D, triangle.findArea(pointA, pointB, pointC), 0D);

    }

    @Test
    public void findArea90Degrees() {
        Triangle.Point pointA = new Triangle.Point(0, 4);
        Triangle.Point pointB = new Triangle.Point(3, 0);
        Triangle.Point pointC = new Triangle.Point(0, 0);

        assertEquals(6D, triangle.findArea(pointA, pointB, pointC), 0D);
    }

    @Test
    public void findArea() {
        Triangle.Point pointA = new Triangle.Point(3, 2);
        Triangle.Point pointB = new Triangle.Point(7, 5);
        Triangle.Point pointC = new Triangle.Point(0, 0);

        assertEquals(0.5D, triangle.findArea(pointA, pointB, pointC), 0.001D);
    }
}