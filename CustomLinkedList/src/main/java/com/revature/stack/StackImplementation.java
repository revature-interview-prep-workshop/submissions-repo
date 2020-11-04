package com.revature.stack;

import com.revature.linkedList.Node;

public class StackImplementation<T> {

    private StackNode<T> head;

    public  StackImplementation() {

    }


    public StackImplementation(StackNode previous) {
        this.head = previous;
    }

    public void push(T value) {
        StackNode<T> newNode = new StackNode<T>(value);
        StackNode<T> oldHead = head;
        head = newNode;
        head.setPrevious(oldHead);
        System.out.println(newNode.getData() + " pushed into the stack");
    }

    public T pop() {
        if (head != null) {
            T data = head.getData();
            head = head.getPrevious();
            return data;
        }
        return null;

    }

    public T peek(){
        if (head != null) {
            return head.getData();
        }
        return null;
    }


    public void printStack() {

        StackNode<T> currentNode = this.head;

        while (currentNode != null) {
            System.out.println("Node contains: " + currentNode.getData());
            currentNode = currentNode.getPrevious();
        }

    }

}
