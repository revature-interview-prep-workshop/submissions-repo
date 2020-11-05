package com.dsaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueImplTest {
	
	QueueImpl queueImpl = new QueueImpl();

	@Test
	public void testIsQueue() {
		assertEquals("java.util.PriorityQueue", queueImpl.myQueue.getClass().getName());
	}

}
