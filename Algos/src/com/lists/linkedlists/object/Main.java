package com.lists.linkedlists.object;

public class Main {

public static void main(String[] args) {
		
		Employee john = new Employee("John", "Doe", "4567");
		Employee mike = new Employee("Mike", "Lawson", "3245");
		Employee vir = new Employee("Vir", "Bharath", "9999");
		Employee bharath = new Employee("Bharath", "Desh", "1234");
		
		EmployeeLinkedListImpl employeeLinkedListImpl = new EmployeeLinkedListImpl();
		employeeLinkedListImpl.addToFront(john);
		employeeLinkedListImpl.addToFront(mike);
		employeeLinkedListImpl.addToFront(vir);
		employeeLinkedListImpl.addToFront(bharath);
		
		employeeLinkedListImpl.printLinkedListNodes();
		
		System.out.println(employeeLinkedListImpl.size());
		
	}
}
