package com.frank.course.chapter_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.frank.course.Solution;

public class Table implements Solution {
    List<Float> types = Arrays.asList(1.0f, -1.0f, +0.0f, -0.0f, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY,
            Float.NaN);

    public ArrayList<ArrayList<Float>> getResult() {
        ArrayList<ArrayList<Float>> result = new ArrayList<ArrayList<Float>>();
        for (int i = 0; i < types.size(); i++) {
            result.add(new ArrayList<Float>());
            for (int j = 0; j < types.size(); j++)
                result.get(i).add(types.get(i) / types.get(j));
        }
        return result;
    }

    public String getMarkDownTable() {
        StringBuilder result = new StringBuilder();
        ArrayList<ArrayList<Float>> table = this.getResult();
        result.append("|被除数\\除数|");
        for (Float i : types) {
            result.append(i);
            result.append('|');
        }
        result.append("\n|");
        result.append(String.join(
            "", Collections.nCopies(types.size()+1, "-|")
        ));
        for (int i = 0; i < table.size(); i++) {
            result.append("\n|**");
            result.append(types.get(i));
            result.append("**|");
            for (Float j : table.get(i)) {
                result.append(j);
                result.append('|');
            }
        }
        return result.toString();
    }

    public void print() {
        System.out.println(this.getMarkDownTable());
    }
}