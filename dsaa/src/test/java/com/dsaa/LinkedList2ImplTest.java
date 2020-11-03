package com.dsaa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedList2ImplTest {
	
	LinkedList2Impl linkedList2Impl = new LinkedList2Impl();

	@Test
	public void testAdd() {
		assertEquals(0, linkedList2Impl.myIntList.size());
		linkedList2Impl.myIntList.add(1);
		assertEquals(1, linkedList2Impl.myIntList.size());
		assertEquals(Integer.valueOf(1), linkedList2Impl.myIntList.get(0));
	}
	
	@Test
	public void testAddFirst() {
		assertEquals(0, linkedList2Impl.myIntList.size());
		linkedList2Impl.myIntList.add(1);
		linkedList2Impl.myIntList.add(2);
		assertEquals(2, linkedList2Impl.myIntList.size());
		linkedList2Impl.myIntList.addFirst(5);
		assertEquals(3, linkedList2Impl.myIntList.size());
		assertEquals(Integer.valueOf(5), linkedList2Impl.myIntList.get(0));
	}
	
	@Test
	public void testAddLast() {
		assertEquals(0, linkedList2Impl.myIntList.size());
		linkedList2Impl.myIntList.add(1);
		linkedList2Impl.myIntList.add(2);
		assertEquals(2, linkedList2Impl.myIntList.size());
		linkedList2Impl.myIntList.addLast(5);
		assertEquals(3, linkedList2Impl.myIntList.size());
		assertEquals(Integer.valueOf(5), linkedList2Impl.myIntList.get(2));
	}
	
	@Test
	public void testContains() {
		assertEquals(0, linkedList2Impl.myIntList.size());
		linkedList2Impl.myIntList.add(1);
		linkedList2Impl.myIntList.add(2);
		assertEquals(2, linkedList2Impl.myIntList.size());
		linkedList2Impl.myIntList.add(5);
		assertEquals(3, linkedList2Impl.myIntList.size());
		assertTrue(linkedList2Impl.myIntList.contains(1));
		assertTrue(linkedList2Impl.myIntList.contains(2));
		assertTrue(linkedList2Impl.myIntList.contains(5));
	}

}
