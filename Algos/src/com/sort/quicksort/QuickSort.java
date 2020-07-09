package com.sort.quicksort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort {
	
	int[] arr = { -17,98,58,-32,20, 35, -15, 7, 55, 1, -22 };

	
	private static void quickSort(int[] arr,int start,int end) {
		
		if(end - start < 2) {
			return;
		}
	
		int pivotIndex = partition(arr, start, end);
		
		quickSort(arr, start, pivotIndex);
		
		quickSort(arr, pivotIndex + 1, end);
	
	}
	
	private static int partition(int[] input,int start, int end) {
		
		int pivot = input[start];
		
		int i = start;
		int j = end;
		
		while(i < j) {
			
			while( i < j && input[--j] >= pivot);
			
			if(i < j) {
				
				input[i] = input[j];
				
			}
			
			while(i < j && input[++i] <= pivot);
			
			if( i < j) {
				input[j] = input[i];
			}
			
		}
		
		input[j] = pivot; 
		
		System.out.println(" i , j "+i +","+j);
		
		return j;
	}
	
	public static void main(String[] args) {
		
		int[] intArray = { -17,98,58,-32,20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        List<Integer> liSort = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		System.out.println(liSort);

		
	}
	
}
