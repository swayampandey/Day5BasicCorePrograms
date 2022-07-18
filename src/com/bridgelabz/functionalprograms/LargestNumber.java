package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class LargestNumber {
	/*
	 * Java Program to Find the Largest Among Three Numbers
	 */

	public static void main(String[] args) {
		/*
		 *  taking three numbers from user by using scanner class
		 *   and storing them in a,b & c respectively
		 */
		System.out.println("Enter First number");
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		 
		int b = sc.nextInt();
		System.out.println("Enter Third number");
		
		int c = sc.nextInt();
		sc.close();  // closing the scanner
		
		if (a>b && a>c) {
			System.out.println("Largest number is " +a);
		}
			else if (b>a && b>c) {
				System.out.println("Largest number is " +b);
			}
			else {
				System.out.println("Largest number is " +c);
			}
		}
	}


