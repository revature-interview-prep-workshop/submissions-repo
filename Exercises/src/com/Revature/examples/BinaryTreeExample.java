package com.Revature.examples;

import com.Revature.model.Node;

public class BinaryTreeExample {
	
	Node root; 
	
	public BinaryTreeExample createTree() {
		BinaryTreeExample tree = new BinaryTreeExample();
		
		tree.add(3);
		tree.add(3);
		tree.add(3);
		tree.add(3);
		tree.add(3);
		tree.add(3);
		tree.add(3);
		
		return tree;
	}
	
	private Node addR(Node current, int data){
		if(current == null){
			return new Node(data);
		}

		if (data<current.data){
			current.left=addR(current.left, data);
			
		} else if (data > current.data){
			current.right=addR(current.right, data);
			
		}else{
			
			return current;
		}
		
		return current;
	}
	
	private boolean hasNodeR(Node current, int data) {
		if(current == null) {
			return false;
		}
		
		if(data == current.data) {
			return true;
		}
		
		return data < current.data
			
		?hasNodeR(current.left, data) : hasNodeR(current.right, data);
		
	}
	
	
	private int smallValue(Node root) {
		return root.left == null ? root.data : smallValue(root.left);
	}
	
	
	private Node deleteNodeR(Node current, int data) {
		if (current == null){
			return null;
		}
		
		if (data == current.data){
			int minVal = smallValue(current.right);
			
			current.data = minVal;
			current.right= deleteNodeR(current.right, minVal);
			
			return current;
		}
		
		if(data < current.data){
			
			current.left = deleteNodeR(current.left, data);
			return current;
			}
		
			current.right = deleteNodeR(current.right, data);
		
		return current;
	}

	
	public void add(int data){
		
		root = addR(root, data);
	}
	
	public boolean hasNode(int data) {
		
		return hasNodeR(root , data);
	}
	
	public void deleteNode(int data) {
		
		root = deleteNodeR(root, data);
	}
	
	

}
