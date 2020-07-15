package com.linkedlist.object.sort;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	
	public void addToFront(String name) {
		
		EmployeeNode currentNode = new EmployeeNode(new Employee(name));
	
		currentNode.next = head;
		
		head = currentNode;
	}
	
	public int sizeOfLinkedList() {
		
		int count = 0;
		
		EmployeeNode currentNode = head;
		
		while(currentNode != null) {
			
			count += 1;
			
			currentNode = currentNode.next;
			
		}
		
		return count;
		
	}
	
	public void printEmployeeLinkedList() {
		
		EmployeeNode currentNode = head;
		
		while(currentNode != null) {
			
			System.out.println(currentNode.toString());
			
			currentNode = currentNode.next;
			
		}
		
	}
	
	public void employeeLinkedListBubbleSort() {
		
		System.out.println("head.next is "+head.next);
		
		EmployeeNode p,q,end;
		
		for(end = null; end != head.next ; end=p) {
			
			for( p = head; p.next != end; p = p.next ) {
				
				q= p.next;
				
				if ((int)p.employee.getName().charAt(0) > (int)q.employee.getName().charAt(0)) {
					
					Employee temp = p.employee;
					
					p.employee = q.employee;
					
					q.employee = temp;
					
				}
				
			}
			
		}
		
	}

}
