package com.revature.stack;

public class StackImplementation<T> {

    private StackImplementation previous;
    private T data;

    public  StackImplementation() {

    }

    public StackImplementation(T data) {
        this.data = data;
    }

    public StackImplementation(StackImplementation previous, T data) {
        this.previous = previous;
        this.data = data;
    }

    public void push(T value) {

    }

    public T pop() {
        return null;
    }

    public T peek(){
        return null;
    }

    public StackImplementation getPrevious() {
        return previous;
    }

    public void setPrevious(StackImplementation previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
