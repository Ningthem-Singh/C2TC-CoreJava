package com.tns.assignment;

public class Loops {

	public static void main(String[] args) {
		// While
		int i = 99;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}

		// do while
		int x = 11;
		do {
			System.out.println(x);
			x++;
		} while (x <= 1);

		// for
		for (int a = 1, b = 1; a < 10 || b < 10; a++, b++) {
			b++;
			System.out.println("a=" + a + " and b=" + b);
		}

	}

}
