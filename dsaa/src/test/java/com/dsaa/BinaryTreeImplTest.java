package com.dsaa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeImplTest {
	
	BinaryTreeImpl binaryTreeImpl = new BinaryTreeImpl(1);

	@Test
	public void testInsertNode() {
		binaryTreeImpl.setLeft(new BinaryTreeImpl(2));
		assertEquals(2, binaryTreeImpl.getLeft().getKey());
	}
	
	@Test
	public void testContainsNode() {
		assertEquals(1, binaryTreeImpl.getKey());
	}
	
	@Test
	public void testRemoveNode() {
		binaryTreeImpl.setLeft(new BinaryTreeImpl(2));
		assertEquals(2, binaryTreeImpl.getLeft().getKey());
		binaryTreeImpl.setLeft(null);
		assertEquals(1, binaryTreeImpl.height());
	}

}
