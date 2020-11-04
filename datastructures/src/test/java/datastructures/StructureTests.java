package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datastructures.strucures.LinkedList;
import datastructures.strucures.Stack;

public class StructureTests {

	private LinkedList<Integer> list = new LinkedList<>();
	private Stack<Integer> stack = new Stack<>();
	
	@BeforeEach
	public void before() {
		System.out.println("STARTING TEST");
	}
	@AfterEach
	public void after() {
		System.out.println("FINISHED TEST");
	}
	
	@Test
	public void listEmpty() {
		System.out.println("List should be empty.");
		Assertions.assertTrue(list.isEmpty());
	}
	
	@Test
	public void stackEmpty() {
		System.out.println("Stack should be empty.");
		Assertions.assertTrue(stack.isEmpty());
	}
	
	@Test
	public void listShouldHave1() {
		list.add(1);
		Assertions.assertEquals("\n[1]\n", list.toString());
	}
	
	@Test
	public void lastStackElementShouldBeThree() {
		for(int i=1;i<4;i++) {
			stack.push(i);
		}
		Assertions.assertEquals(3, stack.peek());
	}

	@Test
	public void stackShouldPopThree() {
		stack.push(3);
		Assertions.assertEquals(3,  stack.pop());
	}
	
	@Test
	public void listShouldEndWithNine() {
		list.add(1);
		list.add(9);
		Assertions.assertEquals("\n[1, 9]\n", list.toString());

	}
}
