package com.frank.course.chapter_3;

import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();
    public void push(T e) {
        linkedList.addLast(e);
    }
    public T pop() {
        return linkedList.pollLast();
    }
    public boolean empty() {
        return linkedList.isEmpty();
    }
    public int search(T e) {
        return linkedList.indexOf(e) + 1;
    }
    public T peek() {
        return linkedList.peekLast();
    }
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (T t : linkedList) {
            stringBuffer.append(t.toString() + ' ');
        }
        return stringBuffer.toString();
    }
}