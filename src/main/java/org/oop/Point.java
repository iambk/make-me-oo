package org.oop;

public class Point {
    private double x;
    private double y;

    public double distanceFrom(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public double angleFrom(Point point) {
        return Math.atan2(point.y - this.y, point.x - this.x);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}