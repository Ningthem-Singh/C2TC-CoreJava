package com.tns.session;

class Parent {
	void property() {
		System.out.println("house.....Car......cash.....plots");
	}

	void marry() {
		System.out.println("Shakuntala");
	}

}

class FinalDemoMethod extends Parent { // cannot override final method
	void marry() // method overriding
	{
		System.out.println("Katrina");
	}

	public static void main(String[] args) {
		FinalDemoMethod obj = new FinalDemoMethod();
		obj.marry();
		obj.property();
	}
}
