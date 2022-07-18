package com.bridgelabz.basicCorePrograms;
import java.util.Scanner;

public class NameCommandLine {
/**
 * java program to get the name using the command line.
 */

	public static void main(String[] args) {
		/**
		 * taking name as user input using scanner class
		 * storing the entered name in string variable name
		 * printing the name
		 */
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Your name is : " +name);
		sc.close();
		

	}

}
