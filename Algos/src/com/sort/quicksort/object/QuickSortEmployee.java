package com.sort.quicksort.object;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sort.insertionsort.object.Employee;

public class QuickSortEmployee {
	
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
		
		mergeSort(employees, 0, employees.length);
		
		List<Employee> employeeSortQuick = Arrays.stream(employees).collect(Collectors.toList());
		
		List<String> names = employeeSortQuick.stream().map(Employee::getName).collect(Collectors.toList());
		
		System.out.println(names);
		
	}
	
	
	private static void mergeSort(Employee[] employees, int start, int end) {
		
		if ( end - start < 2) {
			return ;
		}
		
		int pivotIndex = partition(employees, start, end);
		
		mergeSort(employees, start, pivotIndex);
		
		mergeSort(employees, pivotIndex + 1, end);
		
	}
	
	private static int partition(Employee[] employees ,  int start , int end) {
		
		Employee pivot = employees[start];
		
		int i = start;
		
		int j = end;
		
		while(i < j) {
			
			while( i < j && (int)employees[--j].getName().charAt(0) >= (int)pivot.getName().charAt(0));
			
			if(i < j) {
				
				employees[i] = employees[j];
				
			}
			
			while(i < j && (int)employees[++i].getName().charAt(0) <= (int)pivot.getName().charAt(0));
			
			if( i < j) {
				employees[j] = employees[i];
			}
			
		}
		
		employees[j] = pivot; 
		
		
		return j;
	}

}
