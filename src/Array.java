package com.assignment;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 1, 2 };

		// finding the unique elements in array

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		System.out.println("New array" + set);

		
		// finding the largest no in the array
		// int [] array = new int[] {1,2,3,4,5,6,1,2};
		int largestNo = array[0];

		for (int num : array) {
			if (largestNo < num) {
				largestNo = num;
			}
		}
		System.out.println("Largest num is " + largestNo);

		
		
		// finding the sum of elements in the array
		// int [] array = new int[] {1,2,3,4,5,6,1,2};

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
	}

	



}
