package com.bridgelabz.basicCorePrograms;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		/**
		 * taking user input using scanner class
		 * calculating the prime factors and printing the result
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("Prime Factors of "  +num+  " is :");
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(" " + i);
				num = num / i;
				i = 1;
			}
		}
		sc.close(); 	// closing scanner class 

	}

}
