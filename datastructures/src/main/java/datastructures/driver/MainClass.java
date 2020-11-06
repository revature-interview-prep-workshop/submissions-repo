package datastructures.driver;

import datastructures.strucures.LinkedList;
import datastructures.strucures.Stack;
import datastructures.strucures.Tree;

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
		
		Tree<Integer> tree = new Tree<>();
		Integer arr[] = new Integer[35];
		for(int i=0;i<arr.length;i++)
			arr[i]=i;
//		tree.insertNode(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		tree.insertNode(arr);
//		tree.insertNode(2);
//		tree.insertNode(3);
//		tree.insertNode(4);
//		tree.insertNode(5);
//		tree.insertNode(6);
//		tree.insertNode(7);
//		tree.insertNode(8);
//		tree.insertNode(9);
//		tree.insertNode(10);
//		tree.insertNode(11);
//		tree.insertNode(12);
//		tree.insertNode(13);
//		tree.insertNode(14);
//		tree.insertNode(15);
//		tree.insertNode(16);
//		tree.insertNode(17);
//		tree.insertNode(18);
//		tree.insertNode(19);
		System.out.println("Contents of tree:" + tree);
		System.out.println("14 is present in tree? " + (tree.contains(14) ? "Yes" : "No"));
		System.out.println("Did we delete 14 from tree? " + (tree.removeNode(14) ? "Yes" : "No"));
		System.out.println("After deleting 14, is it present?" + (tree.contains(14) ? "Yes" : "No"));
		System.out.println("Can we still delete it if it doesn't exist? " + (tree.removeNode(14) ? "Yes" : "No"));
		System.out.println("Proof: " + tree.toString());
	}
	
}
