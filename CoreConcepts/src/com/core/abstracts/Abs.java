package com.core.abstracts;

public class Abs extends AbstractClassDemo{

	@Override
	public void me() {
		// TODO Auto-generated method stub
		System.out.println("ME");
	}

	@Override
	public void us() {
		// TODO Auto-generated method stub
		System.out.println("US");
	}

	public static void main(String[] args) {
		AbstractClassDemo absDemo = new Abs();
		absDemo.display();
		AbstractClassDemo.main(null);
		absDemo.me();
		absDemo.us();
	}
}
