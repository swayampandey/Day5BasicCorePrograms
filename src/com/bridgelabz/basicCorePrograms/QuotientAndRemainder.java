package com.bridgelabz.basicCorePrograms;
import java.util.Scanner;
public class QuotientAndRemainder {
	/**
	 * Java Program to Compute Quotient and Remainder
	 */

	public static void main(String[] args) {
		/*
		 * taking divident and divisor as user input using scanner class
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Divident:");
		int Divident = sc.nextInt();
		
		System.out.println("Enter Divisor:");
		int Divisor = sc.nextInt();
		
		int quotient= Divident / Divisor;
		int remainder= Divident % Divisor;
		
		System.out.println("Quotient=" +quotient);
		System.out.println("Remainder=" +remainder);
		
		sc.close();		// closing scanner

	}

}
