package com.Revature.examples;

import java.util.LinkedList;

public class LinkedListExample {

		public static void main(String[] args) {
			
			LinkedList<Number> NList = new LinkedList<>();
			
			//Populating the list
			Number N1 = 1;
			Number N2 = 2;
			Number N3 = 3;
			Number N4 = 4;
			Number N5 = 5;
			Number N6 = 6;
			
			NList.add(N1);
			NList.add(N2);
			NList.add(N3);
			NList.add(N4);
			NList.add(N5);
			NList.add(N6);
			
			
			System.out.println(NList.toString());
			System.out.println(" ");
			
			
			//Remove first and last elements
			System.out.println("Removing N1 and N6....");
			NList.removeFirst();
			NList.removeLast();
			
			System.out.println(NList.toString());
			System.out.println(" ");
			
			
			//Remove the element by index
			System.out.println("N4 is being removed....");
			NList.remove(2);
			
			System.out.println(NList.toString());
			System.out.println(" ");
			
			
			
			//Set an element by index
			System.out.println("setting N3....");
			NList.set(2, 4);
			
			System.out.println(NList.toString());
			System.out.println(NList.get(2).toString() + " is back" );
			System.out.println(" ");
			
			//Adding an element by index
			System.out.println("Adding at index 0 and index 4.....");
			NList.add(0,N1);
			NList.add(4, N5);
		
			
			System.out.println(NList.toString());
			System.out.println(" ");
			
			//Testing for object that exist
			System.out.println("N1 should be in there.....");
			
			System.out.println(NList.get(0) + " = " + NList.getFirst());
			System.out.println(NList.contains(N1));
			System.out.println(NList.get(0).equals(N1));
			System.out.println(NList.getFirst().equals(N1));
		}
}
