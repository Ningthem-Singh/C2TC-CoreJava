package com.tns.session;

public class AbstractDemo {

	public static void main(String[] args) {
		Scooty Wego=new Scooty();	
									/*we are using child class AKA scooty  
									and not parent class AKA Vehicle as parent class cannot be abstract  
									as abstract don't allow objects to be created.*/ 
		Wego.NoOfWheels();
		
	}
}
abstract class Vehicle   //partially implemented class as we are not specifying what vehicle it is
{
	abstract void NoOfWheels();
	
}

 class Scooty extends Vehicle	//scooty is inheriting the parent class vehicle
{

	@Override
	void NoOfWheels() {
		System.out.println(2);
	}
	 
}