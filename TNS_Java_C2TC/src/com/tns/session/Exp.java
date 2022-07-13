package com.tns.session;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2 / 0);
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println("I am catch");
		} finally {
			System.out.println(5);
		}
		System.out.println(6); // Outside Blocks
	}

}
