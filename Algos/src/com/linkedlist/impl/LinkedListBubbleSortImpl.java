package com.linkedlist.impl;

public class LinkedListBubbleSortImpl {

	class Node {
		
		 int data;
		
		 Node next;
		
		
		Node(int newData){
			this.data = newData;
		}
	}
	
	
	public Node head;
	
	
	public void addToStart(int val) {
		
		Node currentNode = new Node(val);
		
		currentNode.next = head;
		
		head= currentNode;
		
	}
	
	
	public void printLinkedList() {
		
		Node currentNode = head;
		
		while(currentNode != null) {
			
			System.out.println(currentNode.data);
			
			currentNode = currentNode.next;
			
		}
	}
	
	public void bubbleSortLinkedList() {
		
		Node p,q,end;
		
		for (end = null;end!=head.next ; end= p) {
			
			for(p = head; p.next != end ;p = p.next) {
				
				q= p.next;
				
				if(p.data > q.data) {
					
					int temp = p.data;
					
					p.data = q.data;
					
					q.data = temp;
				}
				
			}
		}
		
	}
}
