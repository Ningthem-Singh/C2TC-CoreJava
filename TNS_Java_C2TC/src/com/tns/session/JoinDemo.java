package com.tns.session;

class Ning extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Ning Thread");

			try {
				// thread sleep for 3 seconds
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace(); // not required
			}
		}
		System.out.println("Running Thread");
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// Create an object
		Ning a = new Ning();
		a.start(); // starting the thread
		a.join(2000); // Amol thread wants to wait for 2 sec only

		for (int i = 0; i < 10; i++) {
			System.out.println("Amol Thread which is main thread");
		}

	}

}
