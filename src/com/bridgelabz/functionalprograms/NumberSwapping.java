package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class NumberSwapping {
	/**
	 * Java Program to Swap Two Numbers
	 */

	public static void main(String[] args) {
		/**
		 * Taking two numbers from user using scanner class 
		 * storing first number in a and second number in b
		 */
		System.out.println("Before Swapping");
		System.out.println();
		System.out.println("Enter First Number ");
		Scanner a= new Scanner(System.in);
		int num1 = a.nextInt();
		System.out.println("Enter Second Number ");
		Scanner b= new Scanner(System.in);
		int num2 = b.nextInt();
		int temp =num1;
		num1 =num2;
		num2=temp;
		System.out.println("After Swapping");
		System.out.println();
		System.out.println("First Number " +num1);
		System.out.println();
		System.out.println("Second Number " +num2);
		a.close(); b.close();
		
	}

}
