package structures;

import java.util.NoSuchElementException;

//use generics here, since we want to store a linked list of any object we desire.
//we will just let 
public class LinkedList<T> {

	//our head of the list
	Node head;
	
	//add a new element to the list
	public void add(T data) {
		Node newNode = new Node(data);
		newNode.next=null;
		
		if(this.head==null) {
			this.head = newNode;
		} else {
			Node last = this.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	//output the linkedlist as a string similar to what is present in Collections class.
	@Override
	public String toString() {
		String out = "\n[";
		
		Node current=this.head;
		while(current != null) {
			out += current;
			if(current.next != null) out += ", ";
			current = current.next;
			
		}
		return out + "]\n";
	}
	
	//output the size of the list
	public int size() {
		int size=0;
		
		Node current = this.head;
		while(current != null) {
			size++;
			current = current.next;
		}
		
		return size;
	}
	
	//remove an element from the list
	public void remove(T item) {
		try {
			//set the head to current
			Node current = this.head, previous = null;
			
			//is the item we seek the head? then set it to next
			if(current != null && current.data.equals(item)) {
				this.head = current.next;
			}
			
			//not the head, we will search here and keep track of previous.
			while(current != null && current.data != item) {
				previous = current;
				current = current.next;
			}
			
			//if we found the key, it should be at current and shouldn't be null.  If not, we throw an exception.
			
			if(current != null) {
				previous.next = current.next;
			} else throw new NoSuchElementException();
		} catch (NoSuchElementException e) {
			System.out.println("No such element: " + item.toString());
		}
	}
	
	//we need to use a node so we know what our current value links to next in the linked list
	class Node {
		T data;
		Node next;
		Node (T t) {
			data = t;
			next = null;
		}
		
		@Override
		public String toString() {
			return data.toString();
		}
	}
}
