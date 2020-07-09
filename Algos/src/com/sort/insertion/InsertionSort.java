package com.sort.insertion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {20,35,-15,7,55,1,-22};
		
		for (int firstSortedIndex = 1; firstSortedIndex < arr.length  ; firstSortedIndex++) {
			
			int newElement = arr[firstSortedIndex];
			
			int i ;
	
			for (i = firstSortedIndex ; i > 0 && arr[i-1] > newElement ; i--) {
				System.out.println(i);
				arr[i] = arr[i-1];
			}
			arr[i] = newElement; 
			
			List<Integer> liSort = Arrays.stream(arr).boxed().collect(Collectors.toList());
			
			System.out.println(liSort);
		}
		
	}
}
