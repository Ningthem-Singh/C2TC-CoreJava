package com.tns.assignment;

public class primitive_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first cases
		int max = 2147483647;
		int min = -2147483648;
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		byte byteMax = 127;
		byte byteMin = -128;

		System.out.println("Max size of int is: " + max);
		System.out.println("Min size of int is: " + min);
		System.out.println("Max size of shortMax is: " + shortMax);
		System.out.println("Min size of shortMin is: " + shortMin);
		System.out.println("Max size of longMax is: " + longMax);
		System.out.println("Max size of longMin is: " + longMin);
		System.out.println("Max size of byteMax is: " + byteMax);
		System.out.println("Max size of byteMin is: " + byteMin);

		// second case
		int value1 = 9 / 2;
		float value2 = 10f / 6f;
		double value3 = 10d / 6d;
		System.out.println("value  1 = " + value1);
		System.out.println("value  2 = " + value2);
		System.out.println("value  3 = " + value3);

	}

}
