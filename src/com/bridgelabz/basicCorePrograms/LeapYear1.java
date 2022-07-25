package com.bridgelabz.basicCorePrograms;
import java.util.Scanner;
public class LeapYear1 {

	public static void main(String[] args) {
		/**
		 * Taking user input by using scanner class
		 */
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Year");
			int year = sc.nextInt();
			
			
			
				if (year>=1582 ||year%100 == 0 && year%400 == 0 || year%100!=0 && year%4==0)
				
					System.out.println("Leap year");
				
				else 
					System.out.println("Not a leap year");
				
				sc.close(); 	// closing scanner
		

	}

}
