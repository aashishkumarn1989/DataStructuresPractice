package com.datastructures.api;

public class StringReplacer {

	public String removeCharacterA(String str) {
		
		if(str == null) { return null;}
		String removedStr = "";	
		for(int i = 0 ; i < str.length() ; i++) {
		    if(!(i < 2 && str.charAt(i) == 'A')) {
		    	removedStr += str.charAt(i);
		    }
		}
		return removedStr;
	}

}
