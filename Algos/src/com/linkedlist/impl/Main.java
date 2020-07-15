package com.linkedlist.impl;

public class Main {

	public static void main(String[] args) {
		
		LinkedListBubbleSortImpl linkedListBubbleSortImpl = new LinkedListBubbleSortImpl();
		
		linkedListBubbleSortImpl.addToStart(20);
		linkedListBubbleSortImpl.addToStart(35);
		linkedListBubbleSortImpl.addToStart(-15);
		linkedListBubbleSortImpl.addToStart(7);
		linkedListBubbleSortImpl.addToStart(55);
		linkedListBubbleSortImpl.addToStart(-22);
		linkedListBubbleSortImpl.addToStart(-22);
		
		linkedListBubbleSortImpl.printLinkedList();
		
		linkedListBubbleSortImpl.bubbleSortLinkedList();
		
		System.out.println("......Sorted.......");
		
		linkedListBubbleSortImpl.printLinkedList();
	}
	
}
