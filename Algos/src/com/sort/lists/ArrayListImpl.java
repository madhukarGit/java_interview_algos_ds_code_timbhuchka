package com.sort.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.lists.linkedlists.object.Employee;

public class ArrayListImpl {

	public static void main(String[] args) {
		
		List<Employee>  emplList =  new ArrayList<>();
		
		
		
		emplList.add(new Employee("John", "Doe", "4567"));
		emplList.add(new Employee("Mike", "Lawson", "3245"));
		emplList.add(new Employee("Vir", "Bharath", "9999"));
		emplList.add(new Employee("Bharath", "Desh", "1234"));
		
		
		
		
		emplList.set(1, new Employee("Vir", "Kohli", "99"));
		
		
		emplList.add(3, new Employee("John", "Lenin", "108"));
		
		
		
		List<Employee> employees = emplList.stream().collect(Collectors.toList());
		
		System.out.println(employees);
		
		Employee[] employeesArray = emplList.toArray(new Employee[emplList.size()]);
		
		for (Employee employee : employeesArray) {
			System.out.println(employee);
		}
	
		System.out.println(emplList.contains(new Employee("Vir", "Kohli", "99")));
		
		}
		
}
