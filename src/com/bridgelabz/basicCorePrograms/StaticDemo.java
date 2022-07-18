package com.bridgelabz.basicCorePrograms;
/**
 *  java program to demonstrate static variables, methods, and blocks.
 */
public class StaticDemo {
	/*
	 * taking static variables
	 */
	static int a = 10;
	static double d = 10.5;
	
	/*
	 * creating static method
	 */
	static void display() {
		System.out.println("This is a static method");
	}
	/*
	 * creating Static block
	 */
	static {
		System.out.println("This is a static block");
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(d);
		display();		// calling static method in main method.
	}

}
