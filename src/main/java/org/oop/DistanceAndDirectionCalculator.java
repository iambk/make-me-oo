package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point p1, Point p2) {
        return p2.distanceFrom(p1);
    }

    public static double direction(Point p1, Point p2) {
        return p1.angleFrom(p2);
    }
}