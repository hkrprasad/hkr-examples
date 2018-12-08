package examples;

import org.junit.Test;

import junit.framework.Assert;

public class TestPrimeFactor {

    @Test
	public void testIsPrimeNumber() {
		
		PrimeFactor primFact = new PrimeFactor();
		
    	Assert.assertEquals(true, primFact.isPrime(13));
		Assert.assertEquals(true, primFact.isPrime(5));
    	Assert.assertEquals(false, primFact.isPrime(12));
		Assert.assertEquals(true, primFact.isPrime(2));
		Assert.assertEquals(true, primFact.isPrime(13));
		Assert.assertEquals(true, primFact.isPrime(17));
		Assert.assertEquals(false, primFact.isPrime(121));
		Assert.assertEquals(true, primFact.isPrime(83));
		Assert.assertEquals(true, primFact.isPrime(97));
		Assert.assertEquals(true, primFact.isPrime(197));
		
	}
	
	@Test
	public void testLargestPrimeFactor() {
		
		PrimeFactor primFact = new PrimeFactor();
		
//		Assert.assertEquals(Integer.valueOf(5),primFact.getLargestPrimefactor(15));
//		Assert.assertEquals(Integer.valueOf(17),primFact.getLargestPrimefactor(13*17));
//		Assert.assertEquals(Integer.valueOf(19),primFact.getLargestPrimefactor(19*21));
		Assert.assertEquals(Long.valueOf(19),primFact.getLargestPrimefactor(Long.valueOf((19*21))));
		Assert.assertEquals(Long.valueOf(19),primFact.getLargestPrimefactor(Long.getLong(("600851475143"))));

		
		
	}

}
