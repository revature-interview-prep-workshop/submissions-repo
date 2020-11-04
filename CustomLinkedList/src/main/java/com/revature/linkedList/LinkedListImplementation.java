package com.revature.linkedList;

public class LinkedListImplementation<T> {

    private Node<T> head;
    private Node<T> tail;

    public T peek() {
        if (head != null) {
            return head.getData();
        }

        return null;
    }

    public T poll() {
        if (head == tail) {
            tail = null;
        }

        if (head != null) {
            T data = head.getData();
            head = head.getNextNode();
            return data;
        }

        return null;
    }

    public boolean removeByKey(T dataValue) {
        if(head.getData() == dataValue) {
            if (head.getNextNode() == null) {
                tail = null;
                head = null;
                return true;
            }
            head = head.getNextNode();
            //true, data was removed
            return true;
        }
        Node<T> currentNode = head;
        while(currentNode.getNextNode() != null) {
            if (currentNode.getNextNode().getData() == dataValue) {
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        //false, data was not removed
        return false;
    }

    public void add(T t, int index) {

    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data, null);
        head.setNextNode(head);
        head = newNode;


    }

    public void addLast (T data) {
        Node<T> newNode = new Node<T>(data, null);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNextNode(newNode);
        }

        tail = newNode;
    }

    public boolean contains(T t) {

        Node<T> currentNode = this.head;

        while (currentNode != null) {
            if(currentNode.getData().equals(t)) {
                return true;
            }
        }
        return false;
    }

    public void printLinkedList() {

        Node<T> currentNode = this.head;

        while (currentNode != null) {
            System.out.println("Node contains: " + currentNode.getData());
            currentNode = currentNode.getNextNode();
        }

    }

}
