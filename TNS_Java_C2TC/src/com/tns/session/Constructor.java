package com.tns.session;

public class Constructor {

		// TODO Auto-generated method stub
		int roll;
		String name;
		String college;

		public Constructor(int roll, String name, String college) {
			super();
			this.roll = roll;
			this.name = name;
			this.college = college;
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
