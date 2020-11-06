package com.revature.data_structures;

import java.util.EmptyStackException;

public class GenericStack<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;
    
    public GenericStack(int s) {
        this.maxSize = s;
        stackArray = new Object[maxSize];
        top = -1;
    }
    public boolean isEmpty() {
        //indexes start at 0, so if the index of top is 0, then there is 
        //one item in the stack
        //if -1 then there are no items in the stack
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize -1);
    }
    public void push(Object o) {
        stackArray[++top] = o;
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) stackArray[top--];
    }
    @SuppressWarnings("unchecked")
    public T peek() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) stackArray[top];
    }
    
}
