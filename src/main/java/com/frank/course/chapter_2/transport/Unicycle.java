package com.frank.course.chapter_2.transport;

public class Unicycle extends Cycle {
    @Override
    public String ride() {
        return "骑独轮车！";
    }

    @Override
    public int wheel() {
        return 1;
    }
}