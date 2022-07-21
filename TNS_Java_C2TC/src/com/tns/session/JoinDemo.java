package com.tns.session;

class Ning extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Ning Thread");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace(); // not required
			}
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Ning a = new Ning();
		a.start();
		a.join(2000); // Amol wants to wait for only

		for (int i = 0; i < 10; i++) {
			System.out.println("Amol Thread");
		}

	}

}
