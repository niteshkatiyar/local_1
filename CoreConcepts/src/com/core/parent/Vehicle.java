package com.core.parent;

public class Vehicle {
	public int tyres;
	public String type;
	
	public Vehicle(String type, int tyres)
	{
		this.type= type;
		this.tyres= tyres;
	}
	public void info()
	{
		System.out.println("Type: "+type);
		System.out.println("Tyres: "+tyres);
	}
	public void info(String desc)
	{
		System.out.println(desc);
	}
	public int info(int x)
	{
		return x;
	}
}
