package com.tns.session;

public class FinalDemoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 class P
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
	 class C extends P
	 {	//cannot override final method
	 	void marry()			//method overriding
	 	{
	 		System.out.println("Katrina");
	 	}
	 	
	 }
}
