package com.frank.course.chapter_2.geometry;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class GeometryTest {

    Random random = new Random();
    Point p;
    NewRectangle r = new NewRectangle();

    @Test
    public void initialization() {
        p = new Point();
        r = new NewRectangle();
        assertTrue(p.getX() == 0 && p.getY() == 0);
        assertTrue(r.height == r.width && r.width == 0);
        double w = random.nextDouble(), h = random.nextDouble();
        r.set(w, h);
        assertEquals(2 * (w + h), r.getPerimeter(), 0.0001);
        assertEquals(w * h, r.getArea(), 0.0001);
    }

    @Test
    public void setValue() {
        initialization();
        double x = random.nextDouble(), y = random.nextDouble();
        double a = random.nextDouble(), b = random.nextDouble();
        p.set(x, y);
        r.set(a, b);
    }
    @Test
    public void pointInRectangle() {
        initialization();
        setValue();
        r.set(p.x, p.y);
        assertTrue(r.bPointIn(p));
        p.set(p.x+1, p.y);
        assertFalse(r.bPointIn(p));
    }
}