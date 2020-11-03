package com.revature.model;

public class PStack<T> {
	PStackNode<T> top;
	int size;
	
	public PStack() {
		top = null;
	}
	
	public void push(T o) {
		PStackNode<T> newNode = new PStackNode<T>(o);
		newNode.below = top;
		top = newNode;
		size++;
	}
	
	public T pop() throws Exception {
		if(size == 0) {
			throw new Exception("Cannot pop from an empty stack");
		}
		PStackNode<T> toReturn = top;
		top = top.below;
		size--;
		return toReturn.value;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public String toString() {
		String out = "PStack[";
		PStackNode<T> currentNode = top;
		while(currentNode != null) {
			out += currentNode.value;
			if(currentNode.below != null) {
				out += ", ";
			}
			currentNode = currentNode.below;
		}
		out += "]";
		return out;
	}
}
