package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class PowerOf2 {
	/*
	 * This program takes a command-line argument N and prints a table of the
		powers of 2 that are less than or equal to 2^N.
	 */

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Power of 2^"+a+" is: "+(Math.pow(2, a)));
		sc.close();
	}

}
