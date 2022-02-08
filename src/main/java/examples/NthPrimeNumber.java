package examples;

/* Problem 7 : 10001st prime
 * 
 *  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 */

public class NthPrimeNumber {
	
	public int getNthPrimeNumber(int nthPos) {
		int primeNum = 2;
		int counter = 2;
		
		if (nthPos < 3) return nthPos-1;
		
		int number = 5;
		do {
			

			if (PrimeFactor.isPrime(number))  {
				primeNum = number;
				counter++;
			}

			number+=2;
			
		} while (counter != nthPos) ; 
		
		
		return primeNum;
	}

}
