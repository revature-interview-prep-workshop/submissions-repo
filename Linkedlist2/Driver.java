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
class Driver {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.printLinkedList();

        ll.addLast(1);
        ll.printLinkedList();
        
        ll.add(3, 1);
        ll.printLinkedList();

        ll.add(9, 2);
        ll.printLinkedList();

        ll.add(4, 0);
        ll.printLinkedList();

        System.out.println(ll.contains(10));
        System.out.println(ll.contains(9));
    }
}