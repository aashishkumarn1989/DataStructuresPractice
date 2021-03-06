package com.linkedlist;

public class MyLinkedList {
	
	LinkedNode headNode;
	
	public MyLinkedList(LinkedNode headNode){
		this.headNode = headNode;
	}
	
	
	public LinkedNode getHeadNode() {
		return this.headNode;
	}
	
	public void setHeadNode(LinkedNode headNode){
		this.headNode = headNode;
	}

	/* adding new node at the first */
	public void addFirst(LinkedNode newNode) {
		if(newNode != null 
			&& newNode.getData()!= null 
			&& !newNode.getData().isEmpty()) {
			newNode.setNextNode(this.getHeadNode());
			this.setHeadNode(newNode);
		}
	}
	
	/* adding new node at the last */
	public void addLast(LinkedNode newNode) {
		if (newNode != null 
				&& newNode.getData() != null 
				&& !newNode.getData().isEmpty()) {
			LinkedNode currentNode = this.getHeadNode();
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}		
	}

	/* deleting the first node in the linkedList */
	public void deleteFirst() {
		LinkedNode headNode = this.getHeadNode();
		if (headNode != null) {
			LinkedNode nextNode = headNode.getNextNode();
			this.setHeadNode(nextNode);
		}
	}


	
	public LinkedNode getLastNode(){
		LinkedNode currentNode = this.getHeadNode();
		while(currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();
		}
		return currentNode;
		
	}

	public int getLength(){
		int length = 0;
		LinkedNode curr = this.getHeadNode();
		while(curr != null) {
			length ++;
			curr = curr.getNextNode();
		}
		return length;
	}


	
	
}
