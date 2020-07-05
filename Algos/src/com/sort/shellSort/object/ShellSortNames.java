package com.sort.shellSort.object;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sort.insertionsort.object.Employee;

public class ShellSortNames {
	
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
		
		
		for(int gap = employees.length/2 ; gap > 0 ; gap /= 2) {
				
			
			for (int i = gap ; i < employees.length; i++) {
				
				Employee newEmployee = employees[i];
				
				int j = i;
				
				
				while(j >= gap && (int)employees[j-gap].getName().charAt(0) >
												(int)newEmployee.getName().charAt(0))
				{
										
					employees[j] =  employees[j-gap];
					
					j -= gap;
					
												}
				
				employees[j] = newEmployee;
				
			}
			
			List<Employee> liEmployeeSort = Arrays.stream(employees).collect(Collectors.toList());
			
			List<String> names=liEmployeeSort.stream().map(Employee::getName).collect(Collectors.toList());
		
			System.out.println(names);
		}
		
	}
	
}
