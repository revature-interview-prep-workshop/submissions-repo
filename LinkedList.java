//https://java2blog.com/implement-singly-linked-list-in-java/
public class LinkedList {
	private Node head;

	public void add(int data){
	if(this.head == null){	
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}else{
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		}
	}

	public Node removeFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}
 
	public void printLinkedList() {
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}

    public static void main(String[] args){
		LinkedList ls = new LinkedList();
		Node node = new Node();
		ls.add(12);
		ls.add(15);
		ls.add(9);
		ls.add(23);
		ls.printLinkedList();
		ls.removeFirst();
		System.out.println(" ");
		ls.printLinkedList();
    }
}

class Node {
	public int data;
	public Node next;
 
	public void displayNodeData() {
		System.out.print("[ " + data +"|"+ next +" ] ->");
	}
}