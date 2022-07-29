package com.kishan.Thread_RUN;

class ThreadEarning extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total = total + 100;
			}
			this.notify();
		}

	}
}

public class TotalEarning_notify_wait_method {
	public static void main(String args[]) throws InterruptedException {
		ThreadEarning te = new ThreadEarning();

		te.start();
		synchronized (te) {
			te.wait();
			System.out.println("total Earning" + te.total);

		}
	}
}
