package Assignment1;

import java.util.Iterator;
import java.util.LinkedList;

public class DataStructure {
	
	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("Softball");
		link.add("Football");
		link.add("Baseball");
		link.add("Hockey");
		
		System.out.println("...........Original list.............");
		Iterator<String> iterator = link.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		link.addFirst("Cheerleading");
		link.addLast("Rugby");
		link.add(3, "Horseback Racing");

		System.out.println("............Modified List...............");
		Iterator<String> iterator1 = link.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		link.remove(2);
		
		System.out.println("............Removing football...............");
		Iterator<String> iterator2 = link.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}
	

}
