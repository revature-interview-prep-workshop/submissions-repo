package com.revature;

public class StackImplementation {

	private int maximus;
	private long[] myArray;
	private int first;
	
	public StackImplementation(int n) {
		maximus = n;
		myArray = new long[maximus];
		first = -1;
	}
	
	public void push(long m) {
		myArray[++first] = m;
	}
	
	public long pop() {
		return  myArray[first--];
	}
	
	public long peek() {
		return myArray[first];
	}
	
	public boolean isEmpty() {
		return (first == -1);
	}
	
	public boolean isFull() {
		return (first == maximus - 1);
	}
}
