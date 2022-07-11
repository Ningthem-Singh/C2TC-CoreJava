//implementation of compare method using arrays
package com.tns.assignment2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {

		int intArr1[] = { 10, 20, 15, 22, 35 }; // First Array

		int intArr2[] = { 10, 15, 22 }; // Second Array

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr1, intArr2));

		System.out.println("----------------------");

	}
}