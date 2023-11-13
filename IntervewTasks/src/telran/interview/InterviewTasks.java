package telran.interview;

import java.util.*;

public class InterviewTasks {
/**
 * 
 * @param ar array of integer numbers
 * @param sum integer number
 * @return true if the given array contains two numbers, the sum of which equals the given sum value
 */
	public static boolean isSum2(int [] ar, int sum) {
	//TODO  should be done with O[N]
		
		boolean flag = false;
		
	    Set<Integer> set = new HashSet<>();

	    for (int num : ar) {
	        
	        if (set.contains(sum - num)) {
	            
	        	flag = true; 
	        	
	        }

	        set.add(num);
	        
	    }

	    return flag; 
	    
	}
	
	/**
	 * 
	 * @param ar array of integer numbers
	 * @return maximal positive number having negative number with the same absolute value
	 */
	public static int getMaxPositiveWithNegativeValue (int ar[]) {
		//TODO should be done with O[N]
		
		Set<Integer> set = new HashSet<>();
        int maxPositive = -1;
       
        for (int num : ar) {
            
        	if (num > 0) {
               
                if (set.contains(-num) && num > maxPositive) {
                 
                	maxPositive = num;
                
                }
            } 
        	
        	else if (num < 0) {
               
                if (set.contains(-num) && -num > maxPositive) {
                   
                	maxPositive = -num;
               
                }
           
        	}

            set.add(num);
            
        }

        return maxPositive;
        
    }
	
	/**
	 * 
	 * @param strings - array of strings
	 * @return Map where key - string, value - number of occurrences in the array
	 */
	public static HashMap<String, Long> getMapOccurrences(String[] strings) {
		//TODO should be done with complexity O[N]
		//Optionally, additional bonus if you apply the method "merge" of the interface Map
		//try to understand this method https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#merge-K-V-java.util.function.BiFunction- 
		//it uses Functional interface BiFunction
		
		HashMap<String, Long> occurrencesMap = new HashMap<>();

	    for (String str : strings) {
	        //default V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
	        occurrencesMap.merge(str, 1L, Long::sum);
	        
	    }

	    return occurrencesMap;
	    
	}
	
	public static boolean isAnagram(String string, String anagram) {
		//TODO
		
		HashMap<Character, Integer> occurrencesMap = new HashMap<>();
		HashMap<Character, Integer> occurrencesMap2 = new HashMap<>();

	    for (Character letter : anagram.toCharArray()) {
	    	
	    	occurrencesMap.merge(letter, 1, Integer::sum);
	    	
	    }

	    for (Character letter : string.toCharArray()) {
	    	
	    	occurrencesMap2.merge(letter, 1, Integer::sum);
	    	
	    }
	    
	    boolean flag = occurrencesMap.equals(occurrencesMap2);
		
		if (anagram.equals(string)) {
	           
	        flag = false;
	        
	    }
		
	    return flag;
		
	} 
	
}


