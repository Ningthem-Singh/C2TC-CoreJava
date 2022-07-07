package com.tns.session;

public class FinalDemoMethod {

	public static void main(String[] args) {

	}
	 class Parent
	 {
	 	void property()
	 	{
	 		System.out.println("house.....Car......cash.....plots");
	 	}
	 	
	 	 final void marry()
	 	{
	 		System.out.println("Shakuntala");
	 	}
	 	
	 	
	 }
	 class Child extends Parent
	 {	//cannot override final method
		 void marry()			//method overriding
	 	{
	 		System.out.println("Katrina");
	 	}
	 	
	 }
}
