package com.frank.course.chapter_1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TableTest {
    private final Table t = new Table();
    private final List<List<Float>> answer = Arrays.asList(
            Arrays.asList(1.0f, -1.0f, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, 0.0f, -0.0f, Float.NaN),
            Arrays.asList(-1.0f, 1.0f, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, -0.0f, 0.0f, Float.NaN),
            Arrays.asList(0.0f, -0.0f, Float.NaN, Float.NaN, 0.0f, -0.0f, Float.NaN),
            Arrays.asList(-0.0f, 0.0f, Float.NaN, Float.NaN, -0.0f, 0.0f, Float.NaN),
            Arrays.asList(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY,
                    Float.NEGATIVE_INFINITY, Float.NaN, Float.NaN, Float.NaN),
            Arrays.asList(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY,
                    Float.POSITIVE_INFINITY, Float.NaN, Float.NaN, Float.NaN),
            Arrays.asList(Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN));

    @Test
    public void printTable() {
        ArrayList<ArrayList<Float>> res = t.getResult();
        assertEquals(answer, res);
    }
}