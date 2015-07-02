package citrusPay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * Given an array of integers write a program to verify (return true or false) if sum of any two
 * numbers in the array can be equal to a given integer k. What is the space and time complexity of
 * your solution?
 * 
 */

/*
 * Time Complexity is: O(N)-> traversing array  + O(1) -> lookup in HashMap 
 * Space complexity is: O(N)-creating array of N size + O(N) - creating HashMap of N size
 * 
 * */

class ArrayApp {

	public boolean checkSumInArrayUsingSet(int[] array, int sum) {
		int temp = 0, hash = 0;
		
		// create HashMap with all values of Array
		Set<Integer> arraySet = new HashSet<Integer>(); 

		for (int i = 0; i < array.length; i++) {
			// Inserting values of array into HashMap
			arraySet.add(array[i]); 
		}

		for (int i = 0; i < array.length; i++) {
			// subtract the given sum value from array elements 
			temp = sum - array[i]; 
				if (arraySet.contains(temp)) // if found return true
				{
					return true;
				} else {
					continue;
				}
				
		}
		return false;
	}
	
	public boolean checkSumInArray(int[] array, int sum) {
		int temp = 0, hash = 0;
		
		// create HashMap with all values of Array
		Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>(); 

		for (int i = 0; i < array.length; i++) {
			// Inserting values of array into HashMap
			arrayMap.put(array[i], array[i]); 
		}

		for (int i = 0; i < array.length; i++) {
			// subtract the given sum value from array elements 
			temp = sum - array[i]; 
			try {
				// and lookup into HashMap for remainder
				hash = (int) arrayMap.get(temp); 
				if (temp == hash) // if found return true
				{
					return true;
				} else {
					continue;
				}
			} catch (NullPointerException e) {
				continue;
			}
		}
		return false;
	}
}

public class SumInArray {
	private static int[] demoArray = { 2, 3, 5, 1, 8, 9, 4, 7, 10, 6 };
	private static int sum;
	public static void main(String[] args) {
		ArrayApp app = new ArrayApp();
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sum to find in array ");
		try {
			sum = scan.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(app.checkSumInArray(demoArray, sum));
	}
}
