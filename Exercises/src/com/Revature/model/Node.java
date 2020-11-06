package com.Revature.model;

public class Node {
	
	public int data;
	public Node left;
	public Node right;
	
	public Node(int data) {
		this.data = data;
		right = null;
		left = null;
	}
}
