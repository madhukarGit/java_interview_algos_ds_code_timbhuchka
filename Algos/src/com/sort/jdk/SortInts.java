package com.sort.jdk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortInts {

	static int[] arr = { -17,98,58,-32,20, 35, -15, 7, 55, 1, -22 };
	
	public static void main(String[] args) {
		
		Arrays.parallelSort(arr);
		
		List<Integer> liJdkSort = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		System.out.println(liJdkSort);
		
	}
	
}
