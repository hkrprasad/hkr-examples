package examples;

/* Probem 3 : Largest Prime Factor
 * 
 *  What is the largest prime factor of the number 600851475143 ?
 * 
 */

public class PrimeFactor {

	public static boolean isPrime(long number) {
		
		long firstMultiple = 2;
		long secondMultiple = 2;
		if (number == 2) return true;
		
		do {
			if (number%firstMultiple == 0) {
				
				return false;	
			} else {
				
				secondMultiple = number / firstMultiple;	
				firstMultiple++;
			}		
			
		} while (secondMultiple > firstMultiple);
		
		
		return true;
		
	}
	
	
	public Long getLargestPrimefactor(Long number) {
		
		Long firstMultiple = new Long(2);
		Long retVal = new Long(0);
		
		
		
		if (number.equals(Long.parseLong("2"))) 
			return Long.getLong("2");
		
		do {
			
			firstMultiple++;
			if (number%firstMultiple == 0 ) {
				if (isPrime(firstMultiple)) {
					retVal = firstMultiple;
				}
			}
			
			
		} while (firstMultiple  <=  number/2);
		
		return retVal;
		
	}
	
	
	
}
