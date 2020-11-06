package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datastructures.strucures.LinkedList;
import datastructures.strucures.Queue;
import datastructures.strucures.Stack;
import datastructures.strucures.Tree;

public class StructureTests {

	private LinkedList<Integer> list = new LinkedList<>();
	private Stack<Integer> stack = new Stack<>();
	private Queue<Integer> queue = new Queue<>();
	private Tree<Integer> tree = new Tree<>();
	
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
		System.out.println("List should contain 1");
		list.add(1);
		Assertions.assertEquals("\n[1]\n", list.toString());
	}
	
	@Test
	public void lastStackElementShouldBeThree() {
		for(int i=1;i<4;i++) {
			stack.push(i);
		}
		System.out.println("Stack should have 3 for its most recent element.");
		Assertions.assertEquals(3, stack.peek());
	}

	@Test
	public void stackShouldPopThree() {
		stack.push(3);
		System.out.println("Stack should return 3 when popped.");
		Assertions.assertEquals(3,  stack.pop());
	}
	
	@Test
	public void listShouldEndWithNine() {
		list.add(1);
		list.add(9);
		System.out.println("List should contain 1 and 9.");
		Assertions.assertEquals("\n[1, 9]\n", list.toString());

	}
	
	@Test
	public void queueShouldBeEmpty() {
		System.out.println("Queue should be empty after creation.");
		Assertions.assertEquals(true, queue.isEmpty());
	}
	
	@Test
	public void queueShouldHaveThree() {
		System.out.println("Queue Should have 3 when peeking at queue");
		queue.enqueue(3);
		Assertions.assertEquals(3, queue.peek());
	}
	
	@Test
	public void treeShouldHaveOne() {
		System.out.println("Tree should contain 1");
		tree.insertNode(new Integer[]{3,2,1});
		Assertions.assertTrue(tree.contains(1));
	}
	
	@Test
	public void treeShouldBeAbleToRemoveOne() {
		System.out.println("Should be able to remove 1 if it exists in tree");
		tree.insertNode(new Integer[] {3,2,1});
		Assertions.assertTrue(tree.removeNode(1));
	}
	
	@Test
	public void treeShouldReturnFalseOnNonExistentElement() {
		System.out.println("Should return false if we try to remove non existent element");
		tree.insertNode(new Integer[] {1,3,5,7,9,11,13});
		Assertions.assertFalse(tree.removeNode(6));
	}
}
