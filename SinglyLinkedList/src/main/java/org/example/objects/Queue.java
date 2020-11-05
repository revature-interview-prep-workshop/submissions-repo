package org.example.objects;

public class Queue<T> {


    public QueueNode<T> head;
    public QueueNode<T> tail;
    public static class QueueNode<T> {
        public T nodeData;
        public QueueNode<T> next;

        public QueueNode(T nodeData){
            this.nodeData = nodeData;
            this.next = null;
        }
    }


    public void offer(T nodeData) {
        QueueNode<T> insert = new QueueNode<T>(nodeData);

        if(this.head == null) {
            this.head = insert;
            this.tail = head;
        } else {
            this.tail.next = insert;
            this.tail = insert;
        }
    }

    public QueueNode<T> peek() {
        if(this.head != null) {
            return this.head;
        } else {
            return null;
        }
    }

    public QueueNode<T> poll() {
        if(this.head != null) {
            QueueNode<T> temp = this.head;
            this.head = this.head.next;
            return temp;
        } else {
            return null;
        }
    }
}
