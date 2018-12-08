package examples;

import org.junit.Test;

import junit.framework.Assert;

public class TestEvenFibonacci {
	
	@Test
	public void testGetEvenFibonacci() {
		
		EvenFibonacci evenFibonacci = new EvenFibonacci();
		
		long expectedValue = 44;
		
		long actualValue = evenFibonacci.getEvenFibonacci(44);
		Assert.assertEquals(expectedValue, actualValue);
		
		expectedValue = 188;
		actualValue = evenFibonacci.getEvenFibonacci(expectedValue);
		Assert.assertEquals(expectedValue, actualValue);
		
		actualValue = evenFibonacci.getEvenFibonacci(expectedValue+10);
		Assert.assertEquals(expectedValue, actualValue);
		
		
		expectedValue = 1089154;
		actualValue = evenFibonacci.getEvenFibonacci(expectedValue);
		Assert.assertEquals(expectedValue, actualValue);
		
		
	}
	
	
	@Test 
	public void testIfFibonacci() {
		
		EvenFibonacci evenFibonacci = new EvenFibonacci();
		
		Assert.assertEquals(false, evenFibonacci.checkIfFibonacci(14));
		
		Assert.assertEquals(true, evenFibonacci.checkIfFibonacci(1));
		Assert.assertEquals(true, evenFibonacci.checkIfFibonacci(2));
		Assert.assertEquals(true, evenFibonacci.checkIfFibonacci(3));
		Assert.assertEquals(true, evenFibonacci.checkIfFibonacci(8));
		Assert.assertEquals(false, evenFibonacci.checkIfFibonacci(9));

		
	}

}
