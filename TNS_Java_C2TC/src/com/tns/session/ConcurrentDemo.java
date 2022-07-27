package com.tns.session;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDemo {

	public static void main(String[] args) {
		ReentrantLock RL = new ReentrantLock(); // Object 1
		RL.lock();
		System.out.println(RL.isLocked());

		// RL.unlock();

		System.out.println(RL.isHeldByCurrentThread());
		System.out.println(RL.getHoldCount());
		System.out.println(RL.getQueueLength());

	}

}
