package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqueString {

	private int count;
	private char result;
	private static int location=0;
	private Map<Character,Integer> charMap;
	
	public FindUniqueString(String demoString)
	{
		charMap = new LinkedHashMap<Character, Integer>(); // selected for Insertion Order
		for(int i=0;i<demoString.length(); i++) // logic to insert chars of string into Map
		{
			char temp = demoString.charAt(i);
			if(charMap.isEmpty()) 
			{
				count =1;
				charMap.put(temp, count);    
			}
			else
			{
				count =1;
				if(charMap.get(temp) != null)
				{
					count = charMap.get(temp);
					count++;
					charMap.put(temp, count);
				}
				else
					charMap.put(temp, count);
			}
		}
	}
	
	public char checkCharInMap()  // method to check count of all the chars, n return first char with count=1
	{
		location =-1;
		for(Map.Entry entry: charMap.entrySet())
		{
			if(entry.getValue() == Integer.valueOf(1))
			{
				result = (char) entry.getKey();
				location++;
				break;
			}
			else 
			{
				location += (int)entry.getValue(); 
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String demoString = "HHHHHelloWorld";
		FindUniqueString demo = new FindUniqueString(demoString);
		System.out.println("First Unique Char: " + demo.checkCharInMap());
		System.out.println("Location of Char: " +location);
	}

}
