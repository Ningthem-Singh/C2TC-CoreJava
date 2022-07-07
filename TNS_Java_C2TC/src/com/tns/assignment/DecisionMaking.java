//implementation of DecionMaking using IfElse
package com.tns.assignment;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// First Case
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();

		if (x != 5)
			System.out.println("Value of x is not 5");
		else
			System.out.println("Value of x is 5");

		System.out.println("------------------");
		// second Case
		int a = 8, b = 7;

		if (a >= b)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
