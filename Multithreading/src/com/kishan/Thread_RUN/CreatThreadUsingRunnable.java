package com.kishan.Thread_RUN;

public class CreatThreadUsingRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Thread 1 is running");
		
	}
	
	
	public static void main(String args[])
	{
		CreatThreadUsingRunnable ob = new CreatThreadUsingRunnable();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();t2.start();
		//t2.start();//exception java.lang.IllegalThreadStateException
	}

	

}
