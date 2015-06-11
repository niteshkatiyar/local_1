package com.core.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapReduce 
{
	private Map myMap;
	private Set mapSet;
	
	public void initialize()
	{
		myMap = new HashMap<Integer, String>();
		mapSet = new HashSet<Map>();
	}
	public void insertInMap()
	{
		myMap.put(1, "Hello");
		myMap.put(1, "World");
	}
	public void display()
	{
		mapSet = myMap.entrySet();
		Iterator i = mapSet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
				
	}
	public static void main(String[] args) {
		MapReduce map = new MapReduce();
		map.initialize();
		map.insertInMap();
		map.display();
	}
	
}
