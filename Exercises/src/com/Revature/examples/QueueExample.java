package com.Revature.examples;

import java.util.ArrayList;
import java.util.List;

public class QueueExample {
	
	List<Object> list = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		
		QueueExample qe = new QueueExample();
		
		qe.addObj(1);
		qe.addObj(2);
		qe.addObj(3);
		qe.addObj(4);
		
		System.out.println(qe.peek());
		System.out.println(qe.pop());
	}
	
	
	
	
	//METHODS
	public QueueExample() {
		super();
	}
	
	public void addObj(Object data) {
		list.add(data);
	}
	
	public Object pop() {
		
		return list.remove(0);
	}
	
	public Object peek() {
	
		return list.get(0);
	}
	

}