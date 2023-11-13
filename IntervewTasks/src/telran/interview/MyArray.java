package telran.interview;

import java.util.Arrays;

/**
 * All methods of the class should have complexity O[1]
 * @author User
 *
 * @param <T>
 */

public class MyArray {
    //TODO fields of the class (encapsulation)
    private int[] array;

    /**
     * constructor
     * @param size - length of the array
     */
    public MyArray(int size) {
        //TODO constructor
      
    	array = new int[size];
    
    }

    /**
     * sets all array's elements with a given value
     * @param value
     */
    public void setAll(int value) {
        //TODO
       
    	Arrays.fill(array, value);
    
    }

    /**
     *
     * @param index
     * @return value at given index or null if index is wrong
     */
    public Integer get(int index) {
        //TODO
        
    	if (index < 0 || index >= array.length) {
            
    		return null;
    		
        }
    	
        return array[index];
    }

    /**
     * sets a given value at a given index
     * throws IndexOutOfBoundsException in the case of wrong index
     * @param index
     * @param value
     */
    public void set(int index, int value) {
        //TODO
        
    	if (index < 0 || index >= array.length) {
            
    		throw new IndexOutOfBoundsException("Index out of bounds");
    		
        }
    	
        array[index] = value;
        
    }
    
}
