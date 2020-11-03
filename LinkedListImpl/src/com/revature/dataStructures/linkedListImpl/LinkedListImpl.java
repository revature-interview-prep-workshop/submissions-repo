package com.revature.dataStructures.linkedListImpl;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("This");
		list.add("is");
		list.add("a");
		list.add("linked");
		list.add("list");
		
		
		System.out.println("ORIGNAL LIST");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		list.addFirst("Well");
		list.addLast(".");
		
		System.out.println();
		
		System.out.println("New LIST");
		Iterator<String> newIterator = list.iterator();
		while(newIterator.hasNext()) {
			System.out.println(newIterator.next());
		}
		
		System.out.println();
		
		System.out.println("Removed Element with List");
		list.remove(); // Removes head of the list
		Iterator<String> newestIterator = list.iterator();
		while(newestIterator.hasNext()) {
			System.out.println(newestIterator.next());
		}
		
		
	}

}
