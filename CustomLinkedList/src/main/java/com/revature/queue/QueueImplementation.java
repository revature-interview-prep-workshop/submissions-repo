package com.revature.queue;

public class QueueImplementation<T> {

    private QueueNode<T> rear;
    private QueueNode<T> front;

    public QueueImplementation() {
    }

    public QueueImplementation(QueueNode<T> rear, QueueNode<T> front) {
        this.rear = rear;
        this.front = front;
    }

    public void enqueue(T value) {


        QueueNode<T> newNode;
        if (front == null) {
            newNode = new QueueNode<T>(null, value);
            front = newNode;
            if (rear == null) {
                rear = front;
            }
        } else {
            newNode = new QueueNode<T>(rear, value);
            QueueNode<T> oldRear = rear;
            rear = newNode;
            rear.setNext(oldRear);
        }
        System.out.println(newNode.getData() + " enqueued");
    }

    public T dequeue() {
        QueueNode<T> oldFront = front;
        front = front.getNext();
        return oldFront.getData();
    }

    public T getRear() {
        return rear.getData();
    }

    public void setRear(QueueNode<T> rear) {
        this.rear = rear;
    }

    public T getFront() {
        return front.getData();
    }

    public void setFront(QueueNode<T> front) {
        this.front = front;
    }

    public void printQueue() {

        QueueNode<T> currentNode = this.rear;

        while (currentNode != null) {
            System.out.println("Node contains: " + currentNode.getData());
            currentNode = currentNode.getNext();
        }

    }

}
