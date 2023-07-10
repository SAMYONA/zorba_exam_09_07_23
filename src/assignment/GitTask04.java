package com.assignment;

import java.util.Arrays;

public class GitTask04 {

	public static void main(String[] args) {
		/*
		 * 4. Given one array as {1, 0, 67, 34, 87, 0 ,0 ,32, 0, 23, 56, 0} Write a java
		 * program to move all the 0 at the end of the array.
		 */

		int[] array = { 1, 0, 67, 34, 87, 0, 0, 32, 0, 23, 56, 0 };
		int n = array.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (array[i] != 0) {
				array[count++] = array[i];
			}
		}

		while (count < n) {
			array[count++] = 0;
		}
		System.out.println(Arrays.toString(array));
	}

}
