package com.frank.course.chapter_1;

import java.util.*;

import com.frank.course.Solution;

public class Vampire implements Solution {
    private boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

    public List<Integer> getVampireNum() {
        Set<Integer> res = new HashSet<Integer>();
        for (Integer i = 10; i < 100; i++)
            for (Integer j = 10; j < 100; j++) {
                String str_i = i.toString(), str_j = j.toString();
                if (sameChars(Integer.toString(i * j), str_i + str_j))
                    res.add(i*j);
            }
        return new ArrayList<Integer>(res);
    }

    public void print() {
        StringBuilder builder = new StringBuilder();
        List<Integer> ans = getVampireNum();
        for (Integer i : ans) {
            builder.append(i);
            builder.append('\n');
        }
        builder.append(String.format("%d vampire integers in total", ans.size()));
        System.out.println(builder.toString());
    }
}