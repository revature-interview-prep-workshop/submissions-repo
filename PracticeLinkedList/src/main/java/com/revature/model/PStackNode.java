package com.revature.model;

public class PStackNode<T> {
	public PStackNode<T> below;
	public T value;
	
	public PStackNode(T value) {
		this.value = value;
	}
}
