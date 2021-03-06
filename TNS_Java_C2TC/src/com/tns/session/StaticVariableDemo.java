//implementation of static variable concept
package com.tns.session;

public class StaticVariableDemo 

{
	String name;//object bound
	int roll;//object bound
	static String coll="Pillai College of Eng";//class bound
	
	
	void display()
	{
		System.out.println(name+" "+roll+" "+coll);
	}
	static void modify() //can only access static members so coll is only modified
	{
		coll="Mumbai University";
	}

	public StaticVariableDemo(String name, int roll) {	//constructor
		super();
		this.name=name;
		this.roll=roll;
	}
   public static void main(String[] args) 
   {
	   StaticVariableDemo s1=new StaticVariableDemo("Rahul",1);
	   
	   StaticVariableDemo s2=new StaticVariableDemo("Reetika",2);
	   
	   modify(); //static method call without using objects
	   
	   s1.display();
	   
	   s2.display();
	   
		

	}
}
