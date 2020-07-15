package com.linkedlist.object.sort;

public class EmployeeLinkedListMain {
	
	public static void main(String[] args) {
		
		EmployeeLinkedList employeeLinkedList =  new EmployeeLinkedList();
		
		employeeLinkedList.addToFront("Madhukar");
		
		employeeLinkedList.addToFront("Virat");
		
		employeeLinkedList.addToFront("Dicaprio");
		
		employeeLinkedList.addToFront("Quentin Terrantino");
		
		System.out.println(employeeLinkedList.sizeOfLinkedList());
		
		employeeLinkedList.printEmployeeLinkedList();
		
		employeeLinkedList.employeeLinkedListBubbleSort();
		
		System.out.println(".......Employee Sort......");
		
		employeeLinkedList.printEmployeeLinkedList();
		
	}
	

}
