package com.frank.course.chapter_3;

import java.util.Map;

public class CountTest {
    // @Test
    public void test() {
        String filename = "Test.java";
        Map<String, Integer> res = new Count(filename).tokenize();
        for (String s : res.keySet())
            System.out.println(String.format("\"%s\": %d", s, res.get(s)));
    }
    public static void main(String args[]) {
        new CountTest().test();
    }
}