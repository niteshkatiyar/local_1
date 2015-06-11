package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class CountDuplicates 
{
	private int[] listOfNumbers;
	private Map<Integer, Integer> myMap;
	private Random myRandom = new Random();
	private int key; private int count;
	private Set<Integer> mySet;
	
	public CountDuplicates()
	{
		myMap = new HashMap<>();
		listOfNumbers = new int[15];
		for(int i=0; i<15; i++)
		{
			listOfNumbers[i] = myRandom.nextInt(10);
			myMap.put(listOfNumbers[i], count);
		}
	}
	
	public void mapDuplicates()
	{
		for(int i=0; i <listOfNumbers.length ; i++)
		{
			key = listOfNumbers[i];
			count = myMap.get(key);
			count++;
			myMap.put(key, count);
		}
	}
	
	public void displayMap()
	{
		mySet = new HashSet<Integer>();
		mySet = myMap.keySet();
		
		for(int i: mySet)
		{
			System.out.println("Key: "+i + " Value: "+myMap.get(i));
		}
		
		
	}
	public void displayArray()
	{
		System.out.print("[");
		for(int i=0; i <listOfNumbers.length; i++)
		{
			System.out.print(listOfNumbers[i]+ " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
}
