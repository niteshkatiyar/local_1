package com.core.basics;

public class Calculator {

	final int a =10;
	private int b = 20;
	public int c = 30;
	private static int d = 40;
	final static int e = 100;
	
	public int sum()
	{
		/*this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
*/		
		return a+b+c+d;
	}
	public int product()
	{
		return a*b*c*d;
	}
	public void add()
	{
		
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.add();
		System.out.println(calc.sum());
	}

}
