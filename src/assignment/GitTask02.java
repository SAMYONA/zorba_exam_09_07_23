package com.assignment;

import java.util.Scanner;

public class GitTask02 {

	public static void main(String[] args) {
		/*
		 * 2. Take input of 15 number of values in an array (array length will be 15,
		 * take user input of the 15 values) Write a java Program and display the array
		 * in reverse order.
		 */
		

			int[] arrayInputOf15Number = new int[15];
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter 15 numbers:");

			for (int i = 0; i < 15; i++) {
				arrayInputOf15Number[i] = scanner.nextInt();
			}

			System.out.println("Array in reverse order:");

			for (int i = 14; i >= 0; i--) {
				System.out.print(arrayInputOf15Number[i] + " ");
			}
		}
	}

}
