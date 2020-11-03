package driver;

import structures.LinkedList;

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
	}
	
}
