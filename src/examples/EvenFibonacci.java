package examples;

/* Problem 2 - Even Fibonacci numbers
 * 
 * Each new term in the Fibonacci sequence is generated by adding 
 * the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 			1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed 
 * four million, find the sum of the even-valued terms.
 * 
 */

public class EvenFibonacci {

	public long getEvenFibonacci(long maxVal) {
		
		long retVal = 0;

		int fib1 = 1;
		int fib2 = 2;
		int fib3 = 3;
		retVal = fib2;
		
		while (retVal <= maxVal) {
			
			fib1 = fib2 + fib3;
			fib2 = fib3 + fib1;
			fib3 = fib1 + fib2;
			retVal = retVal + fib2;
		}
		retVal = retVal - fib2;
		
		
		
		return retVal;
	}
	
	
	// Check if the given number is a Fibonacci number
	public boolean checkIfFibonacci(long fibValue) {
		
		long fib1 = 1;
		long nextVal = 2; 
		
		if ( fibValue == fib1 )return true;
		
		while (nextVal  <=  fibValue) {
			if (fibValue == nextVal) return true;
			else { 
				long temp = nextVal;
				nextVal = temp + fib1;
				fib1 = temp;
			}
		}
		return false;
		
		
	}
	
}
