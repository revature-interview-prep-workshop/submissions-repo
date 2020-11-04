package com.revature.stack;

public class StackNode<T> {

    private StackNode previous;
    private T data;

    public  StackNode() {

    }


    public StackNode(T data) {
        this.data = data;
    }

    public StackNode(StackNode previous, T data) {
        this.previous = previous;
        this.data = data;
    }

    public StackNode getPrevious() {
        return previous;
    }

    public void setPrevious(StackNode previous) {
        this.previous = previous;
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
                "previous=" + previous +
                ", data=" + data +
                '}';
    }
}
