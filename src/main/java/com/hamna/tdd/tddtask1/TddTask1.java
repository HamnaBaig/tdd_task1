package com.hamna.tdd.tddtask1;

import java.util.Scanner;

public class TddTask1 {


	 public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String input = x.nextLine();
		int sum = sumArray(input);
		System.out.println(sum);
		
	}
	 public static boolean getValidValue(String[] array) {
		 boolean validValue = true;
		 int length = array.length;
		 for(int i=0 ; i < length ; i++) {
			 if(Integer.valueOf(array[i]) > 1000)
				 validValue = false;
		 }
	
		 return validValue;
	 }
	 public static int sumArray(String input) {
		 
		 int sum = 0;
		 String array[] = input.split(" ");
		 boolean validValue = getValidValue(array);
		 if(validValue) {
			 int length = array.length;
			 for(int i = 0; i < length ; i++) {
				 sum = sum + Integer.valueOf(array[i]);
				 
			 }
			 
		 }
		 
		 return sum;
	 }
	
	}
	
