package com.sort.insertion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {20,35,-15,7,55,1,-22};
		
		for ( int sortedIndex = 1 ; sortedIndex < arr.length;sortedIndex++) {
			
			int newElement= arr[sortedIndex];
			
			int i;
			
			for (i = sortedIndex;i>0 && arr[i-1]>newElement;i--) {
				
					
					arr[i] = arr[i-1];
				
			}
			arr[i] = newElement;
			
		}
		
		List<Integer> liInsertionSort = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(liInsertionSort);
	}


}
