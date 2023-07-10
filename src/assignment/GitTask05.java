package com.assignment;

import java.util.Scanner;

public class GitTask05 {

	public static void main(String[] args) {
		/*
		  * 5. Take user input of a String array of length 10, consider user has entered
		  * supplicate values, for example: {“Hello”, “Hi”, “Bye”, “Thank You”, “Hi”,
		  * “Done”, “Hello”…} Write a java program and remove all the duplicates from the
		  * array and reconstruct it.
		  */
		
		  Scanner scanner = new Scanner(System.in);
		  String[] array = new String[10];
		  System.out.println("Enter 10 strings:");

		  for (int i = 0; i < 10; i++) {
		   array[i] = scanner.nextLine();
		  }

		  String[] uniqueArray = new String[array.length];
		  int count = 0;

		  for (String element : array) {
		   boolean isDuplicate = false;
		   for (int i = 0; i < count; i++) {
		    if (element.equals(uniqueArray[i])) {
		     isDuplicate = true;
		     break;
		    }
		   }
		   if (!isDuplicate) {
		    uniqueArray[count] = element;
		    count++;
		   }
		  }

		  String[] finalArray = new String[count];
		  System.arraycopy(uniqueArray, 0, finalArray, 0, count);

		  System.out.println("Array after removing duplicates:");
		  for (String element : finalArray) {
		   System.out.println(element);
		  }
		 }
		}

	


