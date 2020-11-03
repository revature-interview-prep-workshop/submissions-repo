package com.dsaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackImplTest {
	
	StackImpl stackImpl = new StackImpl();

	@Test
	public void testIsStack() {
		assertEquals("java.util.Stack", stackImpl.myStack.getClass().getName());
	}

}
