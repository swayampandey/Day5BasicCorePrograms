package com.bridgelabz.basicCorePrograms;
import java.util.Scanner;

public class LeapYear {
	/*
	 *  checking the entered year by user is leap year or not
	 */

	public static void main(String[] args) {
		/*
		 * taking user input using scanner class and storing int year variable
		 */
		System.out.println("Enter any year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();		// closing scanner
		
		if( year%100==0 && year%400==0 || year%100!=0  && year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
		
		

	}

}
