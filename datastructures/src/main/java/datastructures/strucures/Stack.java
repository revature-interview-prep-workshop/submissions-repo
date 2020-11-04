package datastructures.strucures;

import java.util.NoSuchElementException;

//a stack with push, pop, and peek abilities.
//for all intents and purposes, this is just a specialized doubly-linked list.
public class Stack<T> {

	Node head,tail;
	
	public T pop() {
		T data = tail.data;
		if(tail==null) throw new NoSuchElementException();
		tail=tail.previous;
		return data;
	}
	
	public void push(T item) {
		if(head==null) {
			head=tail=new Node(item);
			head.previous=null;
			tail.next=null;
		} else {
			tail.next = new Node(item);
			tail.next.previous = tail;
			tail=tail.next;
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	public T peek() {
		return tail.data;
	}
	
	private class Node {
		private T data;
		private Node next;
		private Node previous;
		private Node(T data) {
			this.data=data;
			next = null;
			previous = null;
		}
		
		@Override
		public String toString() {
			return data.toString();
		}
	}
}
