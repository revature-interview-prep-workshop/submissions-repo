package com.revature.LinkedList;

public class Driver {

	  public static void main(String[] args){
			LinkedList ls = new LinkedList();
			Node node = new Node();
			ls.add(12);
			ls.add(15);
			ls.add(9);
			ls.add(23);
			ls.printLinkedList();
			ls.removeFirst();
			System.out.println(" ");
			ls.printLinkedList();
	    }
}