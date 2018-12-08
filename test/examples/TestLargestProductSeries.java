package examples;

import org.junit.*;

public class TestLargestProductSeries {

	@Test
	public void testGetLargestProduct() {
		
		LargestProductSeries lps = new LargestProductSeries();
		
		Assert.assertEquals(5832, lps.getLargestProduct(4));
		Assert.assertEquals(40824, lps.getLargestProduct(5));

	}
	
	
	
	
}
