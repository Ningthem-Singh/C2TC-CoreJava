package com.tns.assignment;

public class SwitchProgram {

	public static void main(String[] args) {

		// With integer
		int x = 3;
		switch (x) {
		case 1:
			System.out.println("The value of x is 1");
			break;
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
			System.out.println("The value of x is other than 1,2,3");
			break;
		}
		// With Character
		char ch = 'C';
		switch (ch) {
		case 'A':
			System.out.println("The value of x is a");
			break;
		case 'B':
			System.out.println("The value of x is b");
			break;
		case 'C':
			System.out.println("The value of x is c");
			break;
		default:
			System.out.println("The value of x is other than a,b,c");
			break;

		}

	}

}
