package datastructures.strucures;

public class Queue<T> {

	private Node head, tail;
	
	//add an item to the queue
	public void enqueue(T item) {
		//empty, 
		if(head==null) {
			head=tail=new Node(item);
			head.previous=null;
			tail.next=null;
		} else {
			//set tail to new item
			tail.next = new Node(item);
			tail.next.previous = tail;
			tail = tail.next;
		}
	}
	
	public T dequeue() {
		T data = head.data;
		head=head.next;
		return data;
	}
	
	public T peek() {
		return tail.data;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	private class Node {
		T data;
		Node next, previous;
		
		private Node(T item) {
			data=item;
		}
		
		
	}
}
