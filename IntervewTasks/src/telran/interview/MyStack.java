package telran.interview;

import java.util.Random;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * All the method implementations should be in the complexity O[1]
 */

public class MyStack {
		
	//TODO data structure fields
	/**
	* adds a given number at top of the stack
	* @param number
	*/
	
	Random gen = new Random();
	Stack<Integer> stk = IntStream.range(0, 10).mapToObj(i -> gen.nextInt()).collect(Collectors.toCollection(Stack::new));
	int number = 15;
	
	public void push(int number) {
	    	//TODO
	
	}
	
	/**
	 * 
	 * @return number and remove the number form the stack top
	 * In the case the stack is empty the Exception (NoSuchElementException)
	 * must be thrown
	 */

	public int pull() {
			//TODO
	
		return -1;
	
	}
	
	/**
	 * 
	 * @return true if the stack is empty otherwise false
	 */
	
	public boolean isEmpty() {
			//TODO
		
		return false;
		
	}
		
	/**
	 * 
	 * @return maximal number existing in the stack
	 * In the case the stack is empty the Exception (NoSuchElementException)
	 * must be thrown
	 */

	public int getMax() {
			//TODO
			
		return -1;
		
	}
	
}

