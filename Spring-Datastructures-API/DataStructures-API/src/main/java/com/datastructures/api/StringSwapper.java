package com.datastructures.api;

public class StringSwapper {

	public String swapLast2Char(String str) {
			
		if(str == null || str.length()< 2) {
			return str;	
		}
		
		int length = str.length();
		
		String strWithoutLast2Chars = str.substring(0,length - 2);
		
		char secondLastChar = str.charAt(length - 2);
		char lastChar = str.charAt(length - 1);
		
		return strWithoutLast2Chars + lastChar + secondLastChar;
	}

}
