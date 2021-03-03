package com.datastructures.api;

import java.util.Stack;

public class SpecialQueue {
	
	Stack<String> stack1 = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	
	
	public void enQueue(String str) {
		
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		
		stack1.push(str);
		
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		
	}
	
	public String deQueue() {
		return stack1.pop();
	}

}
