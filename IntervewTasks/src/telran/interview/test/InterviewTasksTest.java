package telran.interview.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.interview.InterviewTasks.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import telran.interview.InterviewTasks;

class InterviewTasksTest {

	@Test
	void isSum2Test() {
		
		int [] ar1 = {1000, 300, -200, 20, 40, -10};
		
		assertTrue(isSum2(ar1, 800));
		assertTrue(isSum2(ar1, 990));
		assertFalse(isSum2(ar1, 50));
	
	}
	
	@Test
	void getMaxPositiveWithNegativeValueTest() {
	
		int [] ar1 = {-1, 100, 200, -50, 1, -100, 50};
		int [] ar2 = {-1, -100, 200, -500, 10, -100, 50, 200};
		
		assertEquals(100, getMaxPositiveWithNegativeValue(ar1));
		assertEquals(-1,  getMaxPositiveWithNegativeValue(ar2));
	
	}
	
	@Test
	void getMapOccurrencesTest() {
		
		String[] strings = {
			"lpm", "ab", "a", "lpm", "a", "aa", "lpm"
		};
		
		HashMap<String, Long> mapOccurrences = getMapOccurrences(strings);
		
		assertEquals(3, mapOccurrences.get("lpm"));
		assertEquals(2, mapOccurrences.get("a"));
		assertEquals(1, mapOccurrences.get("ab"));
		assertEquals(1, mapOccurrences.get("aa"));
	
	}
	
	@Test
	void isAnagramTest() {
		
		String string = "yellow";
		
		assertTrue(isAnagram(string, "wolely"));
		assertTrue(isAnagram(string, "elolwy"));
		assertTrue(isAnagram(string, "lowely"));
		assertTrue(isAnagram(string, "ollwey"));
		assertFalse(isAnagram(string, "wolelw")); //not y
		assertFalse(isAnagram(string, string)); //the same order
		assertFalse(isAnagram(string, "wglely")); //g is not from the string
		assertFalse(isAnagram(string, "wolye")); //must be two 'l'   
		
	}
	
/*	@Test
	    void displayDigitsDistributionTest() {
	       
		// Redirect the standard output to capture the printed content
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStream));

	        // Call the method that prints the digits distribution
	        InterviewTasks.displayDigitsDistribution();

	        // Restore the standard output
	        System.setOut(System.out);

	        // Get the printed content as a string
	        String printedOutput = outputStream.toString().trim();

	        // Assuming the output should contain at least the digit "1"
	        assertTrue(printedOutput.contains("1"), "Output should contain at least the digit 1");
	   
	 
}*/
	
	 
	 }


