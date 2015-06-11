package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import string.FindUniqueString;
public class UniqueCharTest {

	@Test
	public void test() {
		FindUniqueString tester =  new FindUniqueString("HelloWorld");
		char expected = 'H'; 
		char actual = tester.checkCharInMap(); 
		assertEquals(expected, actual);
	}

}
