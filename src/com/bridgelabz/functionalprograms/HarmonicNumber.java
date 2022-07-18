package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class HarmonicNumber {
	/*
	 * java program to print the Nth harmonic number:
	 */

	public static void main(String[] args) {
		/*
		 * taking user input using scanner class
		 */

        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The Harmonic Series is : ");
        double result = 0.0;
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.print(result +"  ");
          }
        System.out.println("");
        System.out.println("Harmonic Series is "+result);
        sc.close();
	}

}
