package Queue;

public class Queue {
	Node head;
	Node tail;
	
	public void isEmpty() {
		if (head == null) {
			System.out.println("Queue is Empty");
		}
	}
	public void peek() {
		System.out.println(head.data);
	}
	public void add(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
		} 
		if (tail != null) {
			tail.next = new_node;
		}
		tail = new_node;
		
		
	}
	
	public void deque() {
		head = head.next;
	}
	public void print() {
		Node tHead = head;
		while(tHead != null) {
			System.out.print(tHead.data + " ");
			tHead = tHead.next;
		}
	}
}
