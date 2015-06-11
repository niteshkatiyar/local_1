package string;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueString2 {
	final private Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
	
	private int[] freq;
	private int[] occr;
	
	public FindUniqueString2() {
		char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		// create a map to map character wiith indexes.
		for (int i = 0 ; i< chars.length ; i++) {
			characterMap.put(chars[i], i);
		}
		// array to record freq of character mapped with index
		freq = new int[chars.length];
		// array to record last position of character mapped with index
		occr = new int[chars.length];
	}
	
	public void findFirstNonRepeatingChar(String str) {
		if (str == null || (str = str.trim()).isEmpty()) {
			System.out.println("Invalid input string:" + str);
			return;
		}
		
		char[] arr = str.toLowerCase().toCharArray();
		// record freq and position.
		for (int i = 0 ; i< arr.length ; i++) {
			int pos = characterMap.get(arr[i]);
			freq[pos]++;
			occr[pos] = i;
		}
		
		// Look-up for only 1st occurrence of unique character.
		for (int i =0; i < arr.length ; i++) {
			int pos = characterMap.get(arr[i]);
			if (freq[pos] == 1) {
				System.out.println("Input:" + str + ", First Non-Repeating Char:" + arr[i] + ", position:" + occr[pos]);
				return;
			}
		}
		
		System.out.println("No non-repeating char found in string:" + str);
	}
	
	public static void main(String[] args) {
		FindUniqueString2 demo = new FindUniqueString2();
		demo.findFirstNonRepeatingChar("HelloWorld");
		demo.findFirstNonRepeatingChar("GeeksforGeeks");
	}

}
