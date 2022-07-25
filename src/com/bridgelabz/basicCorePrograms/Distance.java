package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		/*
		 * taking user input using scanner class
		 */
		 Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the value of x");
		 int x = sc.nextInt();
		System.out.println("Enter the value of y");
		 int y = sc.nextInt();
		  sc.close();     // closing scanner object
		 
		 double distance = Math.sqrt( x*x + y*y );
		 System.out.println("Euclidean distance = " +distance);
		

	}

}
