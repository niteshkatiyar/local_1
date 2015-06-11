package com.core.parent;

public class SingleDesign {
	private static SingleDesign instance;
	private SingleDesign()
	{
		
	}
	
	public static SingleDesign getInstance()
	{
		if(instance  ==  null)
			instance = new SingleDesign();
		return instance;
	}
	
}
