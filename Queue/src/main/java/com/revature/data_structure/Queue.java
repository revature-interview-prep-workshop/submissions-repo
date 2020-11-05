package com.revature.data_structure;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        nItems = 0;
        
    }
    public void insert(long j) {
        if(rear == maxSize -1) {
            rear = -1;
        }
        queArray[++rear] = j;
        nItems++;
    }
    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }
    public long peekFront() {
        return queArray[front];
    }
    public boolean isEmpty() {
        return (nItems == 0);
    }
    public boolean isFull() {
        return (nItems == maxSize);
    }
    public int size() {
        return nItems;
    }
}
