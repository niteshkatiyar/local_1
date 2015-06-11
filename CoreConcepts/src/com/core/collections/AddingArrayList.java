package com.core.collections;

import java.util.ArrayList;
import java.util.List;

public class AddingArrayList {
	private static List<Integer> myList;
	
	public AddingArrayList()
	{
		if (myList == null)
			myList = new ArrayList<>();
	}

	public void populateList()
	{
		for(int i=1; i <=10; i++)
		{
			myList.add(Integer.valueOf(i));
		}
	}
	
	public void searchSum(int sum)
	{
		//first search value = 7
		int tempVal=0;
		int itemOfList=0;
		itemOfList = myList.get(0);
		if(sum > itemOfList)
		{
			tempVal = sum - itemOfList;
		}
		
	}
	
	public int getSum(int x , int y)
	{
		return x+y;
	}
	
	public static void main(String[] args) {
		AddingArrayList list = new AddingArrayList();
		list.populateList();
		//System.out.println(myList.get(0));
	}
}
