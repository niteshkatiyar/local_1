package com.core.basics;

public class StaticClass {
	
	private final static  String name="Dummy";
	private final static int id=0;
	
	public static void getInfo()
	{
		System.out.println(name + " " + id);
	}
	public final void display() // not a good idea.
	{
		System.out.println("Non Static methods");
		
	}
}
