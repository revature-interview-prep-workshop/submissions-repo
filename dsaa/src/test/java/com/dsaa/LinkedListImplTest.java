package com.dsaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListImplTest {

	LinkedListImpl linkedListImpl = new LinkedListImpl();

	@Test
	public void testIsLinkedList() {
		assertEquals("java.util.LinkedList", linkedListImpl.myList.getClass().getName());
	}

}
