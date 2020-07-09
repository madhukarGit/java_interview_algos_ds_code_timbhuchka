package com.sort.merge.object;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sort.insertionsort.object.Employee;

public class MergeSortNames {
	
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
		
		List<Employee> liMergeSort = Arrays.stream(employees).collect(Collectors.toList());
		
		List<String> liMergeSortedNames=liMergeSort.stream().map(Employee::getName).collect(Collectors.toList());
		
		System.out.println(liMergeSortedNames);
	}
	
	
	private static void mergeSort(Employee[] employees , int start , int end) {
		
		if(end - start < 2) {
			return;
		}
		
		int mid = (start+end)/2;
		
		mergeSort(employees, start, mid);
		
		mergeSort(employees, mid, end);
		
		merge(employees,start,mid,end);
		
	}
	
	private static void merge(Employee[] employees, int start, int mid, int end) {
		
		if((int)employees[mid-1].getName().charAt(0) < (int)employees[mid].getName().charAt(0)) {
			
			return;
			
		}
		
		int i = start;
		int j = mid;
		int tempIndex= 0;
		
		Employee[] temp = new Employee[start+end];
		
		while(i < mid && j < end) {
			
			temp[tempIndex++]= (int)employees[i].getName().charAt(0) <= 
					(int)employees[j].getName().charAt(0) ? employees[i++] : employees[j++];
			
		}
		
		System.arraycopy(employees, i, employees, start+tempIndex, mid-i);
		
		System.arraycopy(temp, 0, employees, start, tempIndex);
		
		
	}
	

}
