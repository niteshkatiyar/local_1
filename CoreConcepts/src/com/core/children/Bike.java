package com.core.children;
import java.io.IOException;

import com.core.parent.Vehicle;

public class Bike extends Vehicle 
{

	public Bike(String type, int tyres) {
		super(type, tyres);
		// TODO Auto-generated constructor stub
	}
	public void info()
	{
		System.out.println("Type: "+type);
		System.out.println("Tyres: "+tyres);
	}
	public void info(int x, String y)
	{
		
	}
	/*private void info(int tyres)
	{
		System.out.println(tyres);
	}*/
	public int info(String desc, int tyres)
	{
		return desc.hashCode();
	}
	public static void main(String sp[])
	{
		Vehicle bike = new Bike("Bike",2);
		bike.info();
		bike.info("Talking about Bike");
		System.out.println(bike.info(2));
	}
}
