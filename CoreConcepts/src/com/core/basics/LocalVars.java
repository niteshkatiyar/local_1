package com.core.basics;

public class LocalVars {
	
	private static int j =10;
	private static int x = 100;
	//private int i =20;
	
	private void info()
	{
		int i = 10;
		System.out.println(i);
	}
	public void display()
	{
		System.out.println(j);
	}
	
	
	public static void main(String[] args) {
		LocalVars local = new LocalVars();
		
		local.info();
		System.out.println(j=j+x);
		System.out.println(j);
		System.out.println(x);
	}
}
