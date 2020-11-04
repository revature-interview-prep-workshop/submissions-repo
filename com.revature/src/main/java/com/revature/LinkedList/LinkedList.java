package com.revature.LinkedList;

public class LinkedList {
	private Node head;

	public void add(int data, int index){
		Node node = new Node();
		int position = 0;
		while(index < position - 1) {
			head = head.next;
			position++;
		}
		node.next = head.next;
		head.next = node;
	}
	
	public void addFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data){
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}


	public boolean contains(int data) {
		Node current = head;
		boolean flag = false;
		while (current.next != null) {
			current = current.next;
			if(current.data == data) {
				flag = true;
			}
		}
		return flag;
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
}
