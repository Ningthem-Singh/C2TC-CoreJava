package com.tns.Ningthem;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] c = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80 }, { 90, 100, 110 } } };
		System.out.println(c.length);

		System.out.println(c[0][1][2]);
		System.out.println(c[1][0][1]);

		// below does not work as its out of bound
//		System.out.println(c[1][2][0]);
//		System.out.println(c[1][1][1]);
//		System.out.println(c[2][1][0]);
	}

}
