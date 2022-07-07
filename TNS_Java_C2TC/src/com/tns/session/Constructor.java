package com.tns.session;

public class Constructor {

		// TODO Auto-generated method stub
		int roll;
		java.lang.String name;
		java.lang.String college;

		public Constructor(int roll, java.lang.String string, java.lang.String string2) {
			super();
			this.roll = roll;
			this.name = string;
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
