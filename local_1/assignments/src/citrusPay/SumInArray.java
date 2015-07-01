package citrusPay;

import java.util.HashMap;
import java.util.Map;

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

class App {

	public boolean checkSumInArray(int[] array, int sum) {
		int temp = 0, hash = 0;
		Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>(); // create
																			// a
																			// HashMap
																			// with
																			// all
																			// values
																			// of
																			// Array

		for (int i = 0; i < array.length; i++) {
			arrayMap.put(array[i], array[i]); // Inserting values of array into
												// HashMap
		}

		for (int i = 0; i < array.length; i++) {
			temp = sum - array[i]; // subtract the given sum value from each
									// element in array
			try {
				hash = (int) arrayMap.get(temp); // and lookup into HashMap for
													// remainder

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

	public static void main(String[] args) {
		App app = new App();
		app.checkSumInArray(demoArray, 15);
	}
}
