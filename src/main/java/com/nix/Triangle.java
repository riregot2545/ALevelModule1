package com.nix;

public class Triangle {

    public double findArea(Point pointA, Point pointB, Point pointC) {
        if (pointA.x == pointB.x && pointB.x == pointC.x
                && pointA.y == pointB.y && pointB.y == pointC.y)
            return 0;
        double AB = Math.sqrt(Math.pow((pointA.x - pointB.x), 2) + Math.pow((pointA.y - pointB.y), 2));
        double BC = Math.sqrt(Math.pow((pointB.x - pointC.x), 2) + Math.pow((pointB.y - pointC.y), 2));
        double CA = Math.sqrt(Math.pow((pointC.x - pointA.x), 2) + Math.pow((pointC.y - pointA.y), 2));

        double halfPerimeter = (AB + BC + CA) / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - AB) * (halfPerimeter - BC) * (halfPerimeter - CA));
    }

    public static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
