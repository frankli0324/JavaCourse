package com.frank.course.chapter_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VampireTest {
    @Test
    public void testAmount () {
        assertTrue((new Vampire()).getVampireNum().size() == 7);
    }
}