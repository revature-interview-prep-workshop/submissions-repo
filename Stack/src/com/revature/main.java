package com.revature;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackImplementation myStack = new StackImplementation(10); 
		myStack.push(8);
		myStack.push(16);
		myStack.push(18);
		myStack.push(24);
	    myStack.push(46);
	      
	      while (!myStack.isEmpty()) {
	         long value = myStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
	

}
