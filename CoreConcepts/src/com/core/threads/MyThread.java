package com.core.threads;

public class MyThread extends Thread {
			
	public MyThread(String name)
	{
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread("first-thread");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.start();
	}
}
