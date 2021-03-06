package com.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {
	
	LinkedNode headNode;
	MyLinkedList list; 

	@Before
	public void init() {
		headNode = new LinkedNode("Head");
		list = new MyLinkedList(headNode);
		
	}
	
	/* Tests for Adding New Node to the beginning */ 
	
	@Test
	public void shouldAddNewNodeFirstWhenNodeProvided() {
		
		LinkedNode newNode = new LinkedNode("First");
		list.addFirst(newNode);
		assertEquals("First", list.getHeadNode().data);
	}
	
	@Test
	public void shouldNotAddWhenFirstNullNodeTest() {
		LinkedNode newNode = null;
		list.addFirst(newNode);
		assertEquals("Head", list.getHeadNode().data);
	}
	
	@Test
	public void shouldNotAddWhenFirstNullData() {
		LinkedNode newNode = new LinkedNode(null);
		list.addFirst(newNode);
		assertEquals("Head", list.getHeadNode().data);
	}
	
	@Test
	public void shouldNotAddWhenAddFirstEmptyNode() {
		LinkedNode newNode = new LinkedNode("");
		list.addFirst(newNode);
		assertEquals("Head", list.getHeadNode().data);
	}
	
	
	/* Tests for adding new node at the end */
	
	@Test
	public void shouldAddLastWhenNodeIsProvided(){
		LinkedNode newNode = new LinkedNode("Last");
		list.addLast(newNode);
		LinkedNode currentNode = this.headNode;
		while(currentNode.getNextNode() != null){
			currentNode = currentNode.getNextNode();
		}
		assertEquals(newNode,currentNode);
	}
	
	@Test
	public void shouldNotAddLastWhenNodeIsEmpty(){
		LinkedNode newNode = new LinkedNode("");
		list.addLast(newNode);
		LinkedNode currentNode = this.headNode;
		while(currentNode.getNextNode() != null){
			currentNode = currentNode.getNextNode();
		}
		assertNotEquals(newNode,currentNode);
	}
	
	@Test
	public void shouldNotAddLastWhenNodeIsNull(){
		LinkedNode newNode = null;
		list.addLast(newNode);
		LinkedNode currentNode = this.headNode;
		while(currentNode.getNextNode() != null){
			currentNode = currentNode.getNextNode();
		}
		assertNotEquals(newNode,currentNode);
	}
	
	@Test
	public void shouldNotAddLastWhenNodeDataIsNull(){
		LinkedNode newNode = new LinkedNode(null);
		list.addLast(newNode);
		LinkedNode currentNode = this.headNode;
		while(currentNode.getNextNode() != null){
			currentNode = currentNode.getNextNode();
		}
		assertNotEquals(newNode,currentNode);
	}
	
	/* Tests for deleting the first Node in the List */
	
	@Test
	public void shouldReturnNullWhenDeletingSingleNodeList() {
		list.deleteFirst();
		assertNull(list.getHeadNode());
		
	}
	
	@Test
	public void shouldNotNullWhenDeletingMultipleNodeList() {
		MyLinkedList multiNodeList = new MyLinkedList(headNode);
		multiNodeList.addLast(new LinkedNode("second"));
		multiNodeList.addLast(new LinkedNode("third"));
		multiNodeList.deleteFirst();
		assertNotNull(list.getHeadNode());
		assertEquals("second",multiNodeList.getHeadNode().getData());
		
	}
	
	@Test
	public void shouldGetNullWhenDeletingNullList() {
		MyLinkedList nullHeadNodeList = new MyLinkedList(null);
		nullHeadNodeList.deleteFirst();
		assertNull(nullHeadNodeList.getHeadNode());
		
	}
		

	/* Test for getting the last node in the LinkedList */
	@Test
	public void shouldReturnHeadNodeWhenSingleNodeList(){
		MyLinkedList singleNodeList = new MyLinkedList(new LinkedNode("Single"));
		assertEquals("Single", singleNodeList.getLastNode().getData());
	}

	/* Tests for getting the length of the LinkedList */
	@Test
	public void shouldGet1WhenSingleNodeList(){
		MyLinkedList singleNodeList = new MyLinkedList(new LinkedNode("Single"));
		assertEquals(1, singleNodeList.getLength());
	}
	
	@Test
	public void shouldGetLengthWhenMultiNodeList(){
		MyLinkedList multiNodeList = new MyLinkedList(headNode);
		LinkedNode firstNode = new LinkedNode("first");
		LinkedNode secondNode = new LinkedNode("second");
		LinkedNode thirdNode = new LinkedNode("third");
		multiNodeList.addFirst(firstNode);
		multiNodeList.addFirst(secondNode);
		multiNodeList.addFirst(thirdNode);
		assertEquals(4, multiNodeList.getLength());
	}
	
	
}
