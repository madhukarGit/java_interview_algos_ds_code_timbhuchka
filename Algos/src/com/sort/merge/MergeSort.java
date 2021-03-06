package com.sort.merge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort {


    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        List<Integer> liSort = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		System.out.println(liSort);
	
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        List<Integer> liSort = Arrays.stream(input).boxed().collect(Collectors.toList());
		
		System.out.println(liSort);
	
		System.out.println("..........");
		
		List<Integer> tempArray = Arrays.stream(temp).boxed().collect(Collectors.toList());
		
		System.out.println(tempArray);
	
		
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}
