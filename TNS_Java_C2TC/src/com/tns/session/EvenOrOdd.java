//implementation of EvenOrOdd
package com.tns.session;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		System.out.println("To know whether its even or odd, enter a number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2 ==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
