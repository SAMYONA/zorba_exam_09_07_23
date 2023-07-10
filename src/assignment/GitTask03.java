package com.assignment;

public class GitTask03 {

	public static void main(String[] args) {
		/**
		 * 3. Consider one integer array as {23, 56, 12, 25} Write a java program to
		 * find out 2 nd smallest element from the array.
		 */

		int someArraysOfNumbers[] = { 23, 56, 12, 25 };
		int smallestNumber = Integer.MAX_VALUE;
		int secondSmallestNumber = Integer.MAX_VALUE;

		for (int i = 0; i < someArraysOfNumbers.length; i++) {
			if (someArraysOfNumbers[i] < smallestNumber) {
				secondSmallestNumber = smallestNumber;
				smallestNumber = someArraysOfNumbers[i];
			} else if (someArraysOfNumbers[i] < secondSmallestNumber && someArraysOfNumbers[i] != smallestNumber) {
				secondSmallestNumber = someArraysOfNumbers[i];
			}
		}

		System.out.println("Second smallest number: " + secondSmallestNumber);
	}

}
