package com.tns.session;

public class FinalDemoMethod {

	class Parent {
		void property() {
			System.out.println("house.....Car......cash.....plots");
		}

		void marry() {
			System.out.println("Shakuntala");
		}

	}

	class Child extends Parent { // cannot override final method
		void marry() // method overriding
		{
			System.out.println("Katrina");
		}

	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.marry();
	}
}
