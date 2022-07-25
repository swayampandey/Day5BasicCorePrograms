package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class Quadratic {
	/**
	 * 
	 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
	 */

	public static void main(String[] args) {
		/*
		 * taking user input using scanner class
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		sc.close();  // closing scanner object
		
		int delta =  (b*b)-4*(a*c);
		int root1 = (-b + Math.abs(delta))/(2*a);
		int root2 = (-b - Math.abs(delta))/(2*a);
		System.out.println("Root 1 of X " + root1);
		System.out.println("Root 2 of X " + root2);
	}

}
