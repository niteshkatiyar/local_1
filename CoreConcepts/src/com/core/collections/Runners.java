package com.core.collections;

import java.util.Random;

public final class Runners 
{
	private int currentPosition=0;
	private int previousPosition=0;
	private String name;
	private Random random;
	
	public Runners(String name, int currentPosition, int previousPosition)
	{
		this.name = name;
		this.currentPosition = currentPosition;
		this.previousPosition = currentPosition;
	}
	
	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	public int getPreviousPosition() {
		return previousPosition;
	}
	public void setPreviousPosition(int previousPosition) {
		this.previousPosition = previousPosition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void calculatePosition()
	{
		int current = 0,previous;
		
		previous = this.getCurrentPosition();
		this.setPreviousPosition(previous);
		
		current = (int) (Math.random()*10);
		this.setCurrentPosition(current+1);
		
		//System.out.println(current);
	}
	
	@Override
	public String toString()
	{
		return this.name + "=> new: "+ this.currentPosition + " old: " + this.previousPosition ;
	}
}
