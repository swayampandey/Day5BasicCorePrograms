package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class FlipCoin {
	/**
	 * 
	 * java program for flip Coin and print percentage of Heads and Tails
	 */
		static int head = 0;
		static int tail = 0;
		static int count = 1;
		static double Random=0.0;
	public static void main(String[] args) {
		/**
		 * Taking user input by using scanner class
		 */
		System.out.println("Enter the number of flips");
		Scanner sc = new Scanner(System.in);
		int flips = sc.nextInt();
		sc.close(); 		// closing scanner class
		
		while (count <= flips) {
			Random = Math.random();
			System.out.println(count+ " "+Random);
			
			if (Random < 0.5) {
				head++;
				System.out.println("heads");
				}
			else {
				tail++;
				System.out.println("tails");
			}
				count++;
		}
		System.out.println("Number of heads = " +head);
		System.out.println("Number of tails = " +tail);
		
		double headpercentage = (double)head/flips*100;
		double tailpercentage = (double)tail/flips*100;
		
		System.out.println("Percentage of head  = " +headpercentage);
		System.out.println("Percentage of tail = " +tailpercentage);
		
	}

}
