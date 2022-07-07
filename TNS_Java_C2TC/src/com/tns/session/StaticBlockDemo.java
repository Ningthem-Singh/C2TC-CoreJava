//implementation of static block usage
package com.tns.session;

public class StaticBlockDemo {

	public static void main(String[] args) //main block
	{
		System.out.println(10+20);

	}
	static void m() //static method
	{
		System.out.println("Jai Hind");
	}
	static 			//static blocks--------starts from here
	{
		System.out.println(80+20);
		m();
	}
 
	static
	{
	 System.out.println(70+10);
	}
 
	static
	{
	 System.out.println(10);
	}
	
	static
	{
	 System.out.println(50);
	}
}
