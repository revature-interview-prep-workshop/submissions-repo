package com.revature.model;

public class PLinkedListNode<T> {
	private PLinkedListNode<T> next;
	private T value;
	
	public PLinkedListNode(T o) {
		value = o;
	}
	
	public PLinkedListNode<T> getNext() {
		return next;
	}
	public void setNext(PLinkedListNode<T> next) {
		this.next = next;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}
