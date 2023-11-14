package telran.interview.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.interview.InterviewTasks.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

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
	
	@Test
	    void displayDigitsDistributionTest() {
	       
		int nNumbers = 1_000_000;
		Random gen = new Random();
			
		 TreeMap<Integer, Long> occurrencesMap = gen.ints(nNumbers, 1, nNumbers)
               .mapToObj(Integer::toString)
               .flatMapToInt(CharSequence::chars)
		       .mapToObj(Character::getNumericValue)
		       .collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()));

		 occurrencesMap.entrySet()
		        .stream()
		        .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
		        .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
	   
	 
}
	
	 
	 }


