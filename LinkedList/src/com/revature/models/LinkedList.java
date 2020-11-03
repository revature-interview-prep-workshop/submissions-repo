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
	
	public void addFirst(T value) {
		if (length == 0) {
			this.start = new Node<T>(value);
			length++;
			return;
		}
		
		Node<T> n = new Node<T>(value);
		n.setNext(this.start);
		this.start = n;
		length++;
	}
	
	public void addLast(T value) {
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
	
	public void add(T value, int i) {
		if (i > length) {
			System.out.println("Error: Overflow");
			return;
		}
		
		if(i == 0) {
			addFirst(value);
		}
		
		if(i == length) {
			addLast(value);
		}
		
		int temp = 0;
		Node<T> left = start;
		
		while(temp < i - 1) {
			left = left.getNext();
			temp++;
		}
		
		Node<T> right = left.getNext();
		
		Node<T> n = new Node<T>(value);
		
		left.setNext(n);
		n.setNext(right);
		length++;
	}
	
	public boolean contains(T value) {
		Node<T> n = start;
		
		for(int i = 0; i < length; i++) {
			if (n.getValue().equals(value)) return true;
			n = n.getNext();
		}
		
		return false;
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
		
		
		list.addLast(3);
		list.addLast(1);
		
		list.add(2, 1);
		
		System.out.println(list.contains(2));
	}
}
