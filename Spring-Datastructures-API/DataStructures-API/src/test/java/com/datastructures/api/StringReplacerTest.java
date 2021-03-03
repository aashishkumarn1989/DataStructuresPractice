package com.datastructures.api;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringReplacerTest {
	
	StringReplacer strReplacer = new StringReplacer();
	
	@Test
	public void testReplaceWhenAFirstChar() {	
		String replacedString = strReplacer.removeCharacterA("ABCD");
		assertEquals("BCD",replacedString);
		
	}
	
	@Test
	public void testReplaceWhenAIsSecondChar() {
		String replacedString = strReplacer.removeCharacterA("BACD");
		assertEquals("BCD",replacedString);
		
	}
	
	@Test
	public void testReplaceWhenAIsFirst2Chars() {
		String replacedString = strReplacer.removeCharacterA("AACD");
		assertEquals("CD",replacedString);
		
	}
	
	@Test
	public void testReplaceWhenAIsNotIn2Chars() {
		String replacedString = strReplacer.removeCharacterA("BBAA");
		assertEquals("BBAA",replacedString);
		
	}
	
	@Test
	public void testReplaceWhenAIsInFirst2CharsWithBigString() {
		String replacedString = strReplacer.removeCharacterA("AABCDEFGHAA");
		assertEquals("BCDEFGHAA",replacedString);
		
	}
	
	@Test
	public void testReplaceWhenNullString() {
		String replacedString = strReplacer.removeCharacterA(null);
		assertNull(replacedString);
		
	}

}