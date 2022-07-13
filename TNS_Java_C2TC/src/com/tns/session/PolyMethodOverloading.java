package com.tns.session;

public class PolyMethodOverloading {
	public static void main(String[] args) {
		mo call = new mo();
		// method called using call object
		call.m();
		call.m(2);
		call.m(1.4);
		// additional methods

		// automatic promotion chart used
		call.m('g'); // character
		call.m(101); // long
		call.m(2.3f); // float
	}

}

class mo {

	public void m() {
		System.out.println("No args");
	}

	public void m(int i) {
		System.out.println("integer args");
	}

	public void m(double f) {
		System.out.println("Double args");
		System.out.println("----------------");

	}
}