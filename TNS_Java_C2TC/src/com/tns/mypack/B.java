package com.tns.mypack;
import com.tns.pack.*;

public class B {

	public static void main(String[] args) {
		A obj = new A();
//		com.tns.pack.A obj = new com.tns.pack.A(); 
													//we can also import class a object 
													//by giving the path with the obj name and making a new obj
		obj.msg();	//msg() is brought from the com.tns.pack to this class 
	}

}
