package com.sort.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSortRecursion {
	
	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		insertionSort(intArray, 0, intArray.length);
		
		List<Integer> arrInsertionSort = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		System.out.println(arrInsertionSort);
		
	}
	
	
	private static void insertionSort(int[] arr, int start , int end) {
		
		for(int i = 1 ; i < arr.length;i++) {
			
			int newElement = arr[i];
			
			int j;
			
			for(j =i;j>0 && arr[j-1]>newElement;j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = newElement;
		}
		
	}

}
