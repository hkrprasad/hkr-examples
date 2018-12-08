

/*  Problem : Largest pallindrome product
 * 
 *  A palindromic number reads the same both ways. The largest palindrome made from the product of 
 *  two 2-digit numbers is 9009 = 91 × 99.  
 *  Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 */

package examples;

public class Pallindrome {

	public boolean isPallindrome(long argLong) {
		
		String argString = Long.toString(argLong);
		
		System.out.println("The string is :" + argString);
		
		for (int iLoop = 0 ; iLoop < argString.length()/2; iLoop++)
		{
			if (argString.charAt(iLoop) !=  argString.charAt(argString.length()-1-iLoop)) {
				System.out.println("Characters being compared :" +argString.charAt(iLoop)  + " and " + argString.charAt(argString.length()-1-iLoop));
				return false;
			}
		}
		
		return true;
	}
	
	public long getLargestPallindrome(long argLong) {
		
		long retVal = 0;
		
		long iLoop  = argLong;
		long jLoop = iLoop;
		
		long multiple1 = 0 , multiple2 = 0;
		for (; iLoop > 1; iLoop--) {
			if (retVal > iLoop*iLoop) break;
			
			for (jLoop = iLoop; jLoop > 1; jLoop--) {
				long product = iLoop * jLoop;
				
				if (product < retVal) break;
				
				if (isPallindrome(product))
				{			
					multiple1 = iLoop;
					multiple2 = jLoop;
					retVal = product;					
					
					break;
				}
			}
			
			
		}
		System.out.println("The pallindrom is " + retVal + " and the factors are " + multiple1 + " and " + multiple2);
		return retVal;
	}
	
}
