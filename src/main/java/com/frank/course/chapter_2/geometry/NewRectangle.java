package com.frank.course.chapter_2.geometry;

public class NewRectangle {
    public double width = 0, height = 0;
    public Point anchor = new Point();// left bottom

    public NewRectangle() {
        // all members are already initialized;
    }

    public NewRectangle(double w, double h) {
        this.set(w, h);
        // anchor is already (0, 0)
    }

    public NewRectangle(double w, double h, double x, double y) {
        this.set(w, h);
        this.anchor.set(x, y);
    }

    public void set(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean bPointIn(Point b) {
        if (b.x >= anchor.x && b.y >= anchor.y) {
            if (b.x <= anchor.x + width && b.y <= anchor.y + height)
                return true;
        }
        return false;
    }
}