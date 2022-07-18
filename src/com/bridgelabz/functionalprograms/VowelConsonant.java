package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class VowelConsonant {
	/**
	 * Java Program to Check Whether an Alphabet is Vowel or Consonant
	 */

	public static void main(String[] args) {
		/**
		 * taking character as user input using scanner class and storing character in ch variable 
		 */
		System.out.println("Enter any character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Character is vowel");
	}
		
		else {
			System.out.println("Character is consonant");
		}
		sc.close();

	}

}
