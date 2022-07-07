//implementation of Constructor
package com.tns.session;

public class Constructor {

		int roll;
		String name;
		String college;

		public Constructor(int roll, String string1, String string2) {
			super();
			this.roll = roll;
			this.name = string1;
			this.college = string2;
		}

		void display()
		{
			System.out.println (roll + " " + name+ " "+college);
		}
		public static void main(String[] args) {
			Constructor s1=new Constructor(1, "Alisha", "Pillai");
			Constructor s2=new Constructor(2, "Anusha", "KGE");
			s1.display();
			s2.display();
	}
}
