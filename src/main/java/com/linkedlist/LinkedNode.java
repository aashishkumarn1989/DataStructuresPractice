package com.linkedlist;

public class LinkedNode {
	
	String data;
	LinkedNode nextNode;
	
	
	public LinkedNode(String data) {
		super();
		this.data = data;
		this.nextNode = null;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public LinkedNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(LinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
