package org.example.objects;

public class LinkedList<T> {
    public Node head;
    public static class Node<T> {
        public T nodeData;
        public Node<T> next;

        public Node(T nodeData){
            this.nodeData = nodeData;
            this.next = null;
        }
    }

    public void addLast(T nodeData) {
        if (head == null) {
            this.head = new Node<T>(nodeData);
        } else {
            Node<T> temp = this.head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<T>(nodeData);
        }
    }

    public void addFirst(T nodeData) {
        if(head == null) {
            this.head = new Node<T>(nodeData);
        } else {
            Node first = new Node<T>(nodeData);

            first.next = this.head;
            this.head = first;
        }
    }

    public boolean add(int index, T nodeData) {
        int count = 0;
        Node<T> temp = this.head;
        while(count != index - 1)  {
            if(temp == null) {
                return false;
            }
            temp = temp.next;
            count++;
        }


        Node<T> insert = new Node<T>(nodeData);

        insert.next = temp.next;
        temp.next = insert;
        return true;
    }
    public boolean contains(T nodeData) {
        Node temp = this.head;
        while (temp != null) {
            if(temp.nodeData == nodeData) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }
}
