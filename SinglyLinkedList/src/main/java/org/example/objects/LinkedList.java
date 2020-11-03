package org.example.objects;

public class LinkedList {
    public Node head;
    public static class Node {
        public int nodeData;
        public Node next;

        public Node(int nodeData){
            this.nodeData = nodeData;
            this.next = null;
        }
    }

    public void insert(int nodeData) {
        if (head == null) {
            this.head = new Node(nodeData);
        } else {
            Node temp = this.head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(nodeData);
        }
    }
}
