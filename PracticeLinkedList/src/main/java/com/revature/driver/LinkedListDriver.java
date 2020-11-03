package com.revature.driver;

import com.revature.model.PLinkedList;
//Please forgive my informal testing, I assume this activity does not have to be
// extremely thoroughly completed.
public class LinkedListDriver {
	public static void main(String[] args) {
		PLinkedList<Character> list = new PLinkedList<Character>();
		
		System.out.println(list);//empty list
		System.out.println(list.isEmpty());//true
		list.add('A');
		list.add('B');
		list.add(0,'C');
		list.add(1,'D');
		list.add(4,'E');
		list.add(5,'C');
		System.out.println(list);//C, D, A, B, E, C
		System.out.println(list.size());//6
		System.out.println(list.contains('C'));//true
		System.out.println(list.contains('F'));//false
		System.out.println(list.isEmpty());//false
		System.out.println(list.indexOf('C'));//0
		System.out.println(list.lastIndexOf('C'));//5
		
		list.remove(0);
		System.out.println(list);//D,A,B,E,C
		System.out.println(list.size());//5
		list.remove(1);
		System.out.println(list);//D,B,E,C
		list.remove(3);
		System.out.println(list);//D,B,E
		list.add('G');//D, B, E, G, not printed
		list.remove(new Character('D'));
		System.out.println(list);//B, E, G
		list.remove(new Character('E'));
		System.out.println(list);//B, G
		list.remove(new Character('G'));
		System.out.println(list);//B
		list.add('H');
		list.add('I');//B, H, I
		
		System.out.println(list.get(0));//B
		System.out.println(list.get(1));//H
		System.out.println(list.get(2));//I
		
		list.set(0, new Character('X'));
		System.out.println(list);//X, H, I
		list.set(1, new Character('Y'));
		System.out.println(list);//X, Y, I
		list.set(2, new Character('Z'));
		System.out.println(list);//X, Y, Z
		list.addToFront('W');
		System.out.println(list);//W, X, Y, Z
		
		list.clear();
		System.out.println(list.isEmpty());//true
		System.out.println(list.size());//0
	}
}
