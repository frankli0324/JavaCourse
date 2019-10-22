package com.frank.course.chapter_2.transport;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportTest {
    final Cycle cycles[] = { new Cycle(), new Unicycle(), new Bicycle(), new Tricycle() };

    @Test
    public void ensureWheels() {
        for (int i = 0; i < 4; i++)
            assertTrue(cycles[i].wheel() == i);
    }

    @Test
    public void tryBalance() {
        for (int i = 0; i < 4; i++)
            if(cycles[i] instanceof Bicycle )
                assertEquals(((Bicycle)cycles[i]).balance(), "Bicycles are hard to ride!");
            else if(cycles[i] instanceof Unicycle)
                assertEquals(((Unicycle)cycles[i]).balance(), "Unicycles are hard to ride!");
    }
}