package examples;

import org.junit.*;

public class TestGridLargestProduct {

	@Test
	public void testGetLargestProduct() {
		
		GridLargestProduct glp = new GridLargestProduct();
		
		Assert.assertEquals(70600674, glp.getLargestProduct(4));
		
		Assert.assertEquals(811502, glp.getLargestProduct(3));

		Assert.assertEquals(9603, glp.getLargestProduct(2));

		Assert.assertEquals(2127513600, glp.getLargestProduct(5));

		
	}
	
	
}
