package com.mozss.algorithms.data_structures.graph;

/**
 * @author mozss
 * @create 2019-11-09 15:59
 */
/*
 * 实现深度优先搜索的栈 StackX.class
 * */
public class StackX {
    private final int SIZE = 20;
    private int[] st;
    private int top;

    public StackX() {
        st = new int[SIZE];
        top = -1;
    }

    public void push(int j) {
        st[++top] = j;
    }

    public int pop() {
        return st[top--];
    }

    public int peek() {
        return st[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}