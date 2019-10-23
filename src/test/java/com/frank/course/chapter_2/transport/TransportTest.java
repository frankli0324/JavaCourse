package com.frank.course.chapter_2.transport;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TransportTest {
    @Test
    public void ensureWheels() {
        Cycle cycles[] = { new Cycle(), new Unicycle(), new Bicycle(), new Tricycle() };
        for (int i = 0; i < 4; i++)
            assertTrue(cycles[i].wheel() == i);
    }
}