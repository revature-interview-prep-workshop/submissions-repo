class Node <T> { 
    T data; 
    Node<T> next; 
    public void displayNodeData() {
        System.out.print(data + " => ");
    }
} 

public class LinkedList <T> {
    private Node<T> head;

    public void addFirst(T data) {
        Node n = new Node();
        n.data = data;  
        n.next = head;  
        head = n;       
    }

    public void addLast(T data) {
        Node n = head;
        
        // Get to the last node
        while (n.next != null) {
            n = n.next;
        }

        Node newN = new Node();
        newN.data = data; 
        n.next = newN; 
    }

    public void add(T data, int index) {
        if (index < 0) {
            System.out.println("Index must be > 0");
        } else if (index == 0) {
            Node n = new Node();
            n.data = data;
            n.next = head;  
            head = n; 
        } else {
            Node newH = head;
            Node newN = new Node();
            newN.data = data;
    
            for (int i = 0; i < index - 1; i++) {
                newH = newH.next;
            }
    
            newN.next = newH.next;
            newH.next = newN;
        }
    }

    public boolean contains(T data) {
        Node n = head;
        while (n.next != null) {
            if (data == n.data) {
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public void printLinkedList() {
        Node n = head;
        while (n != null) {
            n.displayNodeData();
            n = n.next;
        }
        System.out.println("linkedlist" + n);
    }
}