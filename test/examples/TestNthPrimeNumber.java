package examples;

import org.junit.*;

public class TestNthPrimeNumber {
	
	@Test
	public void testGetNthPrimeNumber() {
		
		NthPrimeNumber nPM = new NthPrimeNumber();
		Assert.assertEquals(5, nPM.getNthPrimeNumber(3));
		Assert.assertEquals(13, nPM.getNthPrimeNumber(6));
		Assert.assertEquals(17, nPM.getNthPrimeNumber(7));
		Assert.assertEquals(547, nPM.getNthPrimeNumber(101));
		Assert.assertEquals(7927, nPM.getNthPrimeNumber(1001));
		Assert.assertEquals(104743, nPM.getNthPrimeNumber(10001));

	}


}
