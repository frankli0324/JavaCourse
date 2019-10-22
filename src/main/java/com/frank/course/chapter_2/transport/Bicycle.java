package com.frank.course.chapter_2.transport;

public class Bicycle extends Cycle {
    @Override
    public String ride() {
        return "骑自行车！";
    }

    @Override
    public int wheel() {
        return 2;
    }

    public String balance() {
        return "Bicycles are hard to ride!";
    }
}