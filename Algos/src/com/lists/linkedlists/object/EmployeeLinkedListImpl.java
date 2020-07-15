package com.lists.linkedlists.object;

public class EmployeeLinkedListImpl {
	
	private EmployeeNode head;
	
	public void addToFront(Employee employee) {
		
		EmployeeNode node = new EmployeeNode(employee);
		
		node.setNext(head);
		
		head =node;
		
	}
	
	
	public void printLinkedListNodes() {
		
		EmployeeNode current = head;
		
		System.out.println("Head->");
		
		while(current != null) {
			
			System.out.println(current);
			System.out.println("->");
			current  = current.getNext();
		}
		System.out.println("null");
	}
	
	public int size() {
	
		EmployeeNode current = head;
		
		int count = 0;
		
		while (current != null) {
		
			current = current.getNext();
		
			count += 1;
		}
		
		return count;
		
	}
}

