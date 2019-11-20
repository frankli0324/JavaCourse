package com.frank.course.chapter_3;

import java.io.*;
import java.util.*;

public class Count {
    public Count(String filename) {
        this.filename = filename;
    }

    static Set<String> keywords = new HashSet<String>(Arrays.asList(new String[] { "abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof",
            "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return",
            "strictfp", "short", "static", "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while" }));

    Map<String, Integer> statistics = new HashMap<String, Integer>();
    String filename;

    void parseLine(String line) {
        StringTokenizer st = new StringTokenizer(line, ",.;:-\" ()<>[]{}");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            if (keywords.contains(key) == false)
                continue;
            if (statistics.get(key) != null) {
                statistics.put(key, statistics.get(key) + 1);
            } else
                statistics.put(key, 1);
        }
    }

    public Map<String, Integer> tokenize() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null)
                parseLine(line);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return statistics;
    }
}