package com.revature.queue;

public class QueueNode<T> {

    private QueueNode next;
    private T data;

    public QueueNode() {

    }


    public QueueNode(T data) {
        this.data = data;
    }

    public QueueNode(QueueNode previous, T data) {
        this.next = previous;
        this.data = data;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode previous) {
        this.next = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "previous=" + next +
                ", data=" + data +
                '}';
    }
}
