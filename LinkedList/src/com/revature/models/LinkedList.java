package com.revature.models;

public class LinkedList<T> {

	private Node<T> start;
	private int length;
	
	public LinkedList() {
		this.start = null;
		this.length = 0;
	}
	
	public Node<T> get(int i) {
		if (i >= length) {
			return null;
		}
		
		Node<T> n = this.start;
		i--;
		
		while(i >= 0) {
			n = n.getNext();
			i--;
		}
		
		return n;
	}
	
	public void insert(T value) {
		if (length == 0) {
			this.start = new Node<T>(value);
			length++;
			return;
		}
		
		Node<T> n = new Node<T>(value);
		Node<T> end = this.get(length-1);
		end.setNext(n);
		end = n;
		length++;
	}
	
	public T remove() {
		if (length == 0) {
			System.out.println("Error: Underflow");
			return null;
		}
		
		if (length == 1) {
			Node<T> n = start;
			start = null;
			length--;
			return n.getValue();
		}
		
		Node<T> n = get(length-2);
		Node<T> end = n.getNext();
		
		n.setNext(null);
		length--;
		return end.getValue();
	}
	
	public int getLength() {
		return this.length;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.println("Length: " + list.getLength());
		
		list.insert(5);
		list.insert(3);
		list.insert(1);
		
		System.out.println("Length: " + list.getLength());		
		
		System.out.println(list.remove());
		System.out.println(list.remove());
		
		list.insert(1);
		
		System.out.println("Length: " + list.getLength());		
		
		System.out.println(list.remove());
	}
}
