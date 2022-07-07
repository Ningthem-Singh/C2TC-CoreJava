package com.tns.mypack;
import com.tns.pack.*;

public class B {

	public static void main(String[] args) {
		A obj = new A();
		obj.msg();	//msg() is brought from the com.tns.pack to this class 
	}

}
