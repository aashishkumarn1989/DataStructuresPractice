package com.datastructures.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpecialQueueTest {
	
	
	SpecialQueue splQueue = new SpecialQueue();
	
	
	@Test
	public void testWhenAddingOneStringInQueue() {
		SpecialQueue splQueue1 = new SpecialQueue();
		String firstString = "First";
		splQueue1.enQueue(firstString);
		assertNotNull(splQueue1.stack1);
		assertEquals(1,splQueue1.stack1.size());	
	}
	
	@Test
	public void testWhenAddingTwoStringInQueue() {
		SpecialQueue splQueue1 = new SpecialQueue();
		String firstString = "First";
		String secondString = "Second";
		splQueue1.enQueue(firstString);
		splQueue1.enQueue(secondString);
		assertNotNull(splQueue1.stack1);
		assertEquals(2,splQueue1.stack1.size());	
	}
	
	@Test
	public void testWhenAddng2StringsGettingBack1() {
		SpecialQueue splQueue1 = new SpecialQueue();
		String firstString = "First";
		String secondString = "Second";
		splQueue1.enQueue(firstString);
		splQueue1.enQueue(secondString);
		assertNotNull(splQueue1.stack1);
		assertEquals(firstString,splQueue1.deQueue());	
	}
	

}
