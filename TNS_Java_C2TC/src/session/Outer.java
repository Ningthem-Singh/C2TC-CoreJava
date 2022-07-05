package session;

public class Outer {
	static int x = 10; // since inner class is static so int variable needs to be static so that u can
						// access it.
	static int y = 20;

	static class Inner { // static class
		void inner_method() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String args[]) {
		Outer.Inner obj = new Outer.Inner();
		obj.inner_method();
	}

}
