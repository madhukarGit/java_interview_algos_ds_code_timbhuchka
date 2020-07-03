package com.ds.algos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

	public static void main(String[] args) {
		
		//Bubble sort is a quadratic algorithm with O(n2) time complexity
		
		//it degrades with increase in size of array 
		
		//As loops increases to sort with iterations
		
		int[] arr = {20,35,-15,7,55,1,-22};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				List<Integer> arrInline = Arrays.stream(arr).boxed().collect(Collectors.toList());
				System.out.println(arrInline);
						}
		}
		
		for (int aa : arr) {
			System.out.println(aa);
		}
	}
	
}
