package com.revature.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.model.PStack;

public class StackTest {
	
	@Test
	public void testPushAndPop() throws Exception {
		PStack<Integer> ps = new PStack<Integer>();
		ps.push(1);
		Assertions.assertEquals("PStack[1]",ps.toString());
		ps.push(2);
		Assertions.assertEquals("PStack[2, 1]",ps.toString());
		Integer poppedValue = ps.pop();
		Assertions.assertEquals(2, poppedValue);
		Assertions.assertEquals("PStack[1]",ps.toString());
	}
}
