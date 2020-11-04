package datastructures.strucures;

import java.util.NoSuchElementException;

//use generics here, since we want to store a linked list of any object we desire.
//we will just let 
public class LinkedList<T> {

	// our head of the list
	Node head, tail;

	// add a new element to the list
	public void add(T data) {
		Node newNode = new Node(data);
		newNode.next = null;

		if (this.head == null) {
			this.head = newNode;
			this.tail = head;
		} else {
			Node last = tail;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	//added 1705CST 03Nov2020 RC - finds and returns the index of an item if found in the list
	public boolean contains(T item) {
		
		Node current = head;
		while(current.next != null) {
			if(current.data.equals(item)) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	//added 1705CST 03Nov2020 RC - adds a new item to the front of the list
	public void addFirst(T item) {
		Node newNode = new Node(item);
//		Node oldHead = head;
		newNode.next = head;
		head = newNode;
	}
	
	// added 1705CST 03Nov2020 RC - adds a new item a specific index of the list
	public void add(T item, int index) {
		if(index==0) {
			addFirst(item);
			return;
		}
		int currentIndex = 0;
		Node current = head;
		// just skip forward until desired index is reached
		while (currentIndex < index-1 && current.next != null) {
			current = current.next;
			currentIndex++;
		}

		// create new node
		Node newNode = new Node(item);
		// is current.next null? if so, just make it the tail
		if (current.next == null) {
			current.next = newNode;
			tail = current;
		} else { // it isn't, so we have to flip stuff about
			//set the next of newnode to current next
			newNode.next = current.next;
			//now set the next of current to new node
			current.next = newNode;
		}
	}

	// added 1705CST 03Nov2020 RC - adds a new item to the tail of the list
	public void addLast(T item) {
		Node toAdd = new Node(item);
		tail.next = toAdd;
		tail = tail.next;
	}

	// output the linkedlist as a string similar to what is present in Collections
	// class.
	@Override
	public String toString() {
		String out = "\n[";

		Node current = this.head;
		while (current != null) {
			out += current;
			if (current.next != null)
				out += ", ";
			current = current.next;

		}
		return out + "]\n";
	}

	// output the size of the list
	public int size() {
		int size = 0;

		Node current = this.head;
		while (current != null) {
			size++;
			current = current.next;
		}

		return size;
	}

	// remove an element from the list
	public void remove(T item) {
		try {
			// set the head to current
			Node current = this.head, previous = null;

			// is the item we seek the head? then set it to next
			if (current != null && current.data.equals(item)) {
				this.head = current.next;
			}

			// not the head, we will search here and keep track of previous.
			while (current != null && current.data != item) {
				previous = current;
				current = current.next;
			}

			// if we found the key, it should be at current and shouldn't be null. If not,
			// we throw an exception.

			if (current != null) {
				previous.next = current.next;
			} else
				throw new NoSuchElementException();
		} catch (NoSuchElementException e) {
			System.out.println("No such element: " + item.toString());
		}
	}

	// we need to use a node so we know what our current value links to next in the
	// linked list
	private class Node {
		private T data;
		private Node next;

		Node(T t) {
			data = t;
			next = null;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}
}
