package com.revature;

public class LinkedList {
	private Node head;
	
public void insert(int data) {
		
		//instance of the next node
		Node node = new Node(data);
		
		if(getHead() == null) {
			setHead(node);
		} else {
			Node last = getHead();
			while(last.getNext() != null) {
				last = last.getNext();
			}
			
			last.setNext(node);
		}
		
	}
	
	public void printList() {
		Node currNode = getHead();	
		
		while(currNode != null) {
			System.out.println(currNode.getData() + " ");
			currNode = currNode.getNext();
		}
		
		
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
