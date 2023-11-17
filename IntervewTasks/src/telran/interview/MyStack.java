package telran.interview;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * All the method implementations should be in the complexity O[1]
 */

public class MyStack {
		
	//TODO data structure fields
	/**
	* adds a given number at top of the stack
	* @param number
	*/
	
	Stack<Integer> stk = new Stack<>();
	
	public void push(int number) {

		stk.push(number);
		
	}
	
	/**
	 * 
	 * @return number and remove the number form the stack top
	 * In the case the stack is empty the Exception (NoSuchElementException)
	 * must be thrown
	 */

	public int pull() {
		
		 if (stk.isEmpty()) {
	          
			 throw new NoSuchElementException();
	        
		 }
		
		return stk.pop();
	
	}
	
	/**
	 * 
	 * @return true if the stack is empty otherwise false
	 */
	
	public boolean isEmpty() {
		
		return stk.isEmpty();
		
	}
		
	/**
	 * 
	 * @return maximal number existing in the stack
	 * In the case the stack is empty the Exception (NoSuchElementException)
	 * must be thrown
	 */

	public int getMax() {
		
		return Collections.max(stk);
		
	}
	
}

