package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class EvenOdd {
	/**
	 * Java Program to Check Whether a Number is Even or Odd
	 */

	public static void main(String[] args) {
		/**
		 * taking user input using scanner class and storing input in num variable
		 * closing scanner object
		 */
	System.out.println("Enter Number");
	Scanner a = new Scanner(System.in);
	int num = a.nextInt();
	a.close();
	
	if (num%2==0) {
		System.out.println("Even Number");
	}
	else {
		System.out.println("Odd Number");
	}

	}

}
