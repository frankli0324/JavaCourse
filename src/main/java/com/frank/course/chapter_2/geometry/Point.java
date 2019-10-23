package com.frank.course.chapter_2.geometry;

import java.lang.Math;

public class Point {
    double x = 0, y = 0;

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point() {
    }

    public Point(double x, double y) {
        this.set(x, y);
    }

    public double getPerimeter(Point b) {
        return Math.sqrt(Math.pow(b.x - x, 2) + Math.pow(b.y - y, 2));
    }
}