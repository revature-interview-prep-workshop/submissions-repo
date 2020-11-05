package com.revature.stack;

public class stack {
	private int arr[];
	private int size;
	private int index =0;
	
	public void Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

	public int pop(){
		return arr[--index];
	}
		
	public int peek(){
		return arr[index];
	}
		
	public void push(int data) {
		arr[index] = data;
		index++;
	}
}
