package com.revature.LinkedList;

public class Driver {

	  public static void main(String[] args){
			LinkedList ls = new LinkedList();
			Node node = new Node();
			ls.add(12,0);
			ls.add(15,1);
			ls.add(9,2);
			ls.add(23,3);
			ls.printLinkedList();
			ls.removeFirst();
			System.out.println(" ");
			ls.printLinkedList();
	    }
}