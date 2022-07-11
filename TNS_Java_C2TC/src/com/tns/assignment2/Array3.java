// Java program to demonstrate working of deepEquals in arrays.
package com.tns.assignment2;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {

		int a1[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };

		int a2[][] = { { 30, 20 }, { 10, 0 }, { 60, 80 } };

		int a3[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };
		System.out.println("Check if a1 is equal to a2 : " + Arrays.deepEquals(a1, a2));

		System.out.println("Check if a2 is equal to a3 : " + Arrays.deepEquals(a2, a3));

		System.out.println("Check if a1 is equal to a3 : " + Arrays.deepEquals(a1, a3));
	}
}
/*
 * Arrays.equals() works correctly on an single dimensional array but it cannot
 * check the equality of a multidimensional arrays. While Arrays.deepEquals()
 * work on all arrays irrespective of the dimension.
 */