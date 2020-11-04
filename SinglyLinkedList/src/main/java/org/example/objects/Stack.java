package org.example.objects;

public class Stack<T> {

    public StackNode<T> head;
    public static class StackNode<T> {
        public T nodeData;
        public StackNode<T> next;

        public StackNode(T nodeData){
            this.nodeData = nodeData;
            this.next = null;
        }
    }


    public void push(T nodeData) {
        StackNode<T> insert = new StackNode<T>(nodeData);

        if(this.head == null) {
            this.head = insert;
        } else {
            insert.next = this.head;
            this.head = insert;
        }
    }


}
