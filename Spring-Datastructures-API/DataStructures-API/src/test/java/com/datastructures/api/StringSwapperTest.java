package com.datastructures.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringSwapperTest {
	
	StringSwapper swapper = new StringSwapper();
	
	@Test
	public void testSwaplast2CharWith2char() {
		
		String swappedString = swapper.swapLast2Char("AB");
		assertEquals(swappedString ,"BA");
		
	}
	
	@Test
	public void testSwaplast2CharWhen4Chars() {
		
		String swappedString = swapper.swapLast2Char("ABCD");
		assertEquals(swappedString ,"ABDC");
		
	}

	
	@Test
	public void testSwaplast2CharWhen10Chars() {
		
		String swappedString = swapper.swapLast2Char("ABCDEFGHIJ");
		assertEquals(swappedString ,"ABCDEFGHJI");
		
	}
	
	@Test
	public void testSwaplast2CharWhen1Char() {
	
		String swappedString = swapper.swapLast2Char("A");
		assertEquals(swappedString ,"A");
		
	}
	
	@Test
	public void testSwaplast2CharWhen0Char() {
		
		String swappedString = swapper.swapLast2Char("");
		assertEquals(swappedString ,"");
		
	}
	
	@Test
	public void testSwaplast2CharWhenNullString() {
		
		String swappedString = swapper.swapLast2Char(null);
		assertEquals(swappedString,null);
		
	}
	
	
}
