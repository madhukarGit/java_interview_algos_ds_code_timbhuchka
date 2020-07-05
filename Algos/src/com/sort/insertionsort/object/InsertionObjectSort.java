package com.sort.insertionsort.object;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionObjectSort {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[8];
		
		employees[0] = new Employee("Tim Cook");
		employees[1] = new Employee("Leonardo Dicaprio");
		employees[2] = new Employee("Steve Jobs");
		employees[3] = new Employee("Mark zuckerberg");
		employees[4] = new Employee("Tesla");
		employees[5] = new Employee("Pompio");
		employees[6] = new Employee("Donald Trump");
		employees[7] = new Employee("Alastair");
		
		sortEmployeeObjects(employees);		

		//bubbleSort(employees);
		
	}
	
	public static void sortEmployeeObjects(Employee[] employees) {
		
		for(int firstSortIndex = 0; firstSortIndex < employees.length;firstSortIndex++)
		{
			Employee newElement = employees[firstSortIndex];
			
			int i;
			
			for(i=firstSortIndex; i > 0 && (int)employees[i-1].getName().charAt(0) > (int)newElement.getName().charAt(0);i--) {
				
				employees[i] = employees[i-1];
				
			}
			
			employees[i] = newElement;
			
			List<Employee> liSort = Arrays.stream(employees).collect(Collectors.toList());
			
			List<String> names = liSort.stream().map(Employee::getName).collect(Collectors.toList());
			System.out.println(names);
		}
	}
	
	//bubble sort implementation
	public static void bubbleSort(Employee[] employees) {
		
		for(int i = 0 ; i < employees.length-1; i++) {
			for (int j =0 ;j < employees.length -i -1 ; j++) {
				
				if((int)employees[j].getName().charAt(0) > (int) employees[j+1].getName().charAt(0)) {
					
					Employee tempEmployee = employees[j];
					
					employees[j] = employees[j+1];
					
					employees[j+1] = tempEmployee;
				}
			}
			
			List<Employee> bubbleSortEmployees = Arrays.stream(employees).collect(Collectors.toList());
			
			List<String> bubbleSortedNames = bubbleSortEmployees.stream().map(Employee::getName).collect(Collectors.toList());
			
			System.out.println(bubbleSortedNames);
		}
		
	}
	
}
