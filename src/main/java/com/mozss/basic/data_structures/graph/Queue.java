package com.mozss.basic.data_structures.graph;

/**
 * @author mozss
 * @create 2019-11-09 15:58
 */
/*
 * 实现广度优先搜索的队列Queue.class
 * */
public class Queue {
    private final int SIZE = 20;
    private final int[] queArray;
    private int front;
    private int rear;

    public Queue() {
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }

    public void insert(int j) {
        if (rear == SIZE - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
    }

    public int remove() {
        int temp = queArray[front++];
        if (front == SIZE) {
            front = 0;
        }
        return temp;
    }

    public boolean isEmpty() {
        return (rear + 1 == front || front + SIZE - 1 == rear);
    }
}