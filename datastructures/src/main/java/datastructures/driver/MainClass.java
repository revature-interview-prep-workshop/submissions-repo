package datastructures.driver;

import datastructures.strucures.LinkedList;
import datastructures.strucures.Stack;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Adding items to linked list...");
		LinkedList<String> myList = new LinkedList<>();
		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		System.out.println("Items in linked list: " + myList.toString());
		System.out.println("Size of list: " + myList.size());
		System.out.println("Removing \"Two\" from list...");
		myList.remove("Two");
		System.out.println("Size of list now: " + myList.size());
		System.out.println("Contents of list: " + myList.toString());
		
		System.out.println("New Stack incoming...");
		Stack<Integer> stack = new Stack<>();
		System.out.println("Adding a new few elements to stack of 1...2...3...");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Should be 3 at top of stack... " + stack.peek());
		System.out.println("Popping last element... " + stack.pop());
		System.out.println("Should be 2 at top now. " + stack.peek() );
		
		System.out.println("Adding String \"new\" to front of list...");
		myList.addFirst("new");
		System.out.println("List is now " + myList);
		System.out.println("Adding String \"abc\" to index 2");
		myList.add("abc", 1);
		System.out.println("List is now " + myList);
		System.out.println("\"abc\" is present in list? " + ( myList.contains("abc") ? "is present" : "is not present"));
	}
	
}
