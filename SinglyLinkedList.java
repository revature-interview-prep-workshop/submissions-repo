class Node { 
    int data; 
    Node next; 
    public void displayNodeData() {
        System.out.print(data + " => ");
    }
} 

public class SinglyLinkedList {
    private Node head;
 
    public boolean isEmpty() {
        return (head == null);
    }
    
    // Insert first node
    public void insertFirst(int data) {
        Node n = new Node();
        n.data = data;  // Set the new node with the given data
        n.next = head;  // Set the new node to point at the head
        head = n;       // Set the new node as the head
    }
    
    // Delete first node
    public Node deleteFirst() {
        Node n = head;
        head = head.next; // Head is now the next node removing the very first node
        return n;
    }
    
    // Delete after given node
    public void deleteAfter(Node node) {
        Node n = head;
        
        // We don't want whats pointing to be null and make sure it's not the head. Remember it is being deleted AFTER the given node
        while (n.next != null && n.data != node.data) {
            n = n.next;
            System.out.println("Matching node: " + n.data);
        }
        
        // At this point we have the matching node. Since we are deleting *after* it, point it two nodes to the right
        if (n.next != null) {
            n.next = n.next.next;
        }
    }
    
    // Insert node at the end
    public void insertLast(int data) {
        Node n = head;
        
        // Get to the last node
        while (n.next != null) {
            n = n.next;
        }

        Node newN = new Node();
        newN.data = data; // Make new node and input the data
        n.next = newN; // Set the point to the new node
    }
    
    // To => print => that => linked => list => 
    public void printLinkedList() {
        Node n = head;
        while (n != null) {
            n.displayNodeData();
            n = n.next;
        }
        System.out.println();
    }
}