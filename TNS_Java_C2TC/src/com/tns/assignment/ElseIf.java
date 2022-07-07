package com.tns.assignment;

public class ElseIf {

	public static void main(String[] args) {
		// else if
		int x = 7;
		if (x == 5)
			System.out.println("X equals to 5");
		else if (x > 5)
			System.out.println("X is greater to 5");
		else
			System.out.println("X is smaller than 5");

		// nested
		int y = 5;

		if (y == 5)
			if (y >= 5)
				System.out.println("Y is greater than 5");
			else
				System.out.println("Y is smaller than 5");

	}

}
