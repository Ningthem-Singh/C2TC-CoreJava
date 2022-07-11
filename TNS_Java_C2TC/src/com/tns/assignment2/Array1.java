//sorting of arrays
package com.tns.assignment2;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {

		// Array list
		int intArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(intArr); // arrays.sort we are getting from java.util.arrays

		int intKey = 35;

		// Print the key and corresponding index
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey)); // array.binarySearch()
																									// is from
																									// java.util.arrays
	}

}