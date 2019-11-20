package com.frank.course.chapter_3;

import java.util.LinkedList;

public class TestLinkedList {
    public static void handle(String s) {
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '+') {
                linkedList.push(s.charAt(i + 1));
                i += 1;
            } else if (s.charAt(i) == '-') {
                System.out.print(linkedList.pop());
            }
        }
        while (!linkedList.isEmpty()) {
            System.out.print(linkedList.pop());
        }
    }

    public static void main(String args[]) {
        handle("+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---");
    }
}