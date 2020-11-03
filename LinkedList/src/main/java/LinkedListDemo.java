package main.java;

import java.util.LinkedList;


/* ArrayList vs. LinkedList
 * 
 * Bottom Line: LinkedList better for manipulating data in list, ArrayList better for storing & accessing data
 * 
 * Why? ArrayList uses an array, so if an element is inserted or removed, all the following bits shift in memory.
 * LinkedList uses a doubly linked list, so no bit shifting is required. Faster manipulation.
 * 
 * Doubly linked list: Each element (node) in the list stores its own data, 
 * plus links to the memory addresses of the previous and next nodes.
 * 
 * LinkedList also implements Deque so can be used as a queue.
 */

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//populate list
		Integer i1 = 1;
		Integer i2 = 2;
		Integer i3 = 3;
		Integer i4 = 4;
		Integer i5 = 5;
		Integer i6 = 6;
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		list.add(i6);
		
		System.out.println(list.toString());
		System.out.println(" ");
		
		
		// #1 Remove first and last elements 
		System.out.println("#1");
		list.remove(i6);
		list.removeFirst();
		
		System.out.println(list.toString());
		System.out.println(" ");
		
		
		// #2 Remove element by index
		System.out.println("#2");
		list.remove(1);
		
		System.out.println(list.toString());
		System.out.println(" ");
		
		
		// #3 Set element by index
		System.out.println("#3");
		list.set(0, 1);
		
		System.out.println(list.toString());
		System.out.println(" ");
		
		
		// #4 Add element by index, position
		System.out.println("#4");
		list.add(1, i2);
		list.addLast(i6);
		
		System.out.println(list.toString());
		System.out.println(" ");
		
		
		// #5 Test for presence of an object, get elements by index, position
		System.out.println("#5");
		
		System.out.println(list.contains(i3));
		System.out.println(list.get(0));
		System.out.println(list.getLast());
		
	}	

}



