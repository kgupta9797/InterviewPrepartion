package com.kishan.Thread_RUN;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
		//	Thread.yield();
			try {
		Thread.sleep(5000);
			System.out.println("Child thread");
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}

		System.out.println("info" + Thread.currentThread().getName());
	}
}

public class Yield_sleep_join_method {
	public static void main(String arg[]) throws InterruptedException {
		MyThread t1 = new MyThread();
//MyThread t2 = new MyThread();
		t1.start();
		t1.join();
		//t1.yield();
		// t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		System.out.println(Thread.currentThread().getName());

	}
}
