package com.assignment;

import java.sql.Array;

public class GitTask01 {

	public static void main(String[] args) {

		int[] array = { 34, 2, 33, 21, 1, 5, 7 };
		sortArray(array);

		System.out.println("Sorted Array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void sortArray(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swap array[j] and array[j + 1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
		}
	}
			}
	}
}
