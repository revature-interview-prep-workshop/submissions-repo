package com.Revature.examples;

public class StackExample {

	private int maxSize;
	private int[] stackArray;
	private int head; 
		
	public StackExample(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		head = 1;
	
	}
	
	public static void main(String[] args) {
		StackExample se = new StackExample(6);
		se.push(2);
		se.push(3);
		se.push(4);
		se.push(5);
		
		se.dump();
		
		se.pop();
		
		se.peek();
		
	}
	
	private void push(int i) {
		stackArray[++head]= i;
	}
	

	private void dump() {
		for(int i = 0; i<stackArray.length; i++) {
			System.out.println(stackArray[i]);
		}
		
	}
	

	private int pop() {
		return stackArray[head--];
		
	}

	private int peek() {
		return stackArray[head];
		
	}
	
	

}
