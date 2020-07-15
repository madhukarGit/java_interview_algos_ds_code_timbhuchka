package com.linkedlist.impl;

public class LinkedListMergeSort {
	
	private Node head;

	class Node{
		
		int data;
		
		Node next;
		
		Node(int val){
			
			this.data = val;
			
		}
		
	}
	
	
	public void addToFront(int val) {
		
		Node currentNode = new Node(val);
		
		currentNode.next = head; 
		
		head = currentNode;
		
	}
	
	public void printLinkedList() {
		
		Node currentNode = head;
		
		while(currentNode != null) {
			
			System.out.println(currentNode.data);
			
			currentNode = currentNode.next;
			
		}
	}
	
	public void mergeSort(Node head) {
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		LinkedListMergeSort linkedListMergeSort = new LinkedListMergeSort();
		
		linkedListMergeSort.addToFront(20);
		linkedListMergeSort.addToFront(35);
		linkedListMergeSort.addToFront(-15);
		linkedListMergeSort.addToFront(7);
		linkedListMergeSort.addToFront(55);
		linkedListMergeSort.addToFront(-22);
		
		linkedListMergeSort.printLinkedList();
		
		
	}
}
