package com.kishan.Thread_RUN;

public class CreateAThread extends Thread{
	
	public void run()
	{
		System.out.println("Thread 1 is running");
	}
	
	public static void main(String args[])
	{
		CreateAThread t1 = new CreateAThread();
		CreateAThread t2 = new CreateAThread();
		
	t1.start();
	t2.start();
	}

}
