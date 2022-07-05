package session;

//static block usage
public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 + 20);
	}

	static void m() { // static method
		System.out.println("Jai Hind");
	}

	static { // static blocks
		System.out.println(80 + 20);
		m(); // static method is called here so that it prints its value after the static
				// block
	}

	static {
		System.out.println(70 + 10);
	}

	static {
		System.out.println(10);
	}

	static {
		System.out.println(50);
	}
}