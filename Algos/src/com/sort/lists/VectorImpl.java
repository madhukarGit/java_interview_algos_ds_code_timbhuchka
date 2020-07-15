package com.sort.lists;

import java.util.List;
import java.util.Vector;

import com.lists.linkedlists.object.Employee;

public class VectorImpl {

	public static void main(String[] args) {
		
		//Vector is Synchronized ..
		
		//Array List can be synchronized by adding methods with Synchronized return type
		
		List<Employee> liVector = new Vector<>();
		
		liVector.add(new Employee("John", "Doe", "4567"));
		liVector.add(new Employee("Mike", "Lawson", "3245"));
		liVector.add(new Employee("Vir", "Bharath", "9999"));
		liVector.add(new Employee("Bharath", "Desh", "1234"));
		
		liVector.remove(1);
	}
}
