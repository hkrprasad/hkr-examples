package examples;

import org.junit.Assert;
import org.junit.Test;

public class TestPallindrome {
	
	@Test
	public void testIsPallindrome() {
		
		Pallindrome objPallindrome = new Pallindrome();
		
		Assert.assertEquals(true, objPallindrome.isPallindrome(121));
		Assert.assertEquals(false, objPallindrome.isPallindrome(1321));
		Assert.assertEquals(true, objPallindrome.isPallindrome(1222221));
		Assert.assertEquals(true, objPallindrome.isPallindrome(1222222221));
		Assert.assertEquals(false, objPallindrome.isPallindrome(122121211));
		Assert.assertEquals(true, objPallindrome.isPallindrome(1));
		Assert.assertEquals(true, objPallindrome.isPallindrome(99));
		Assert.assertEquals(false, objPallindrome.isPallindrome(122));
		
	}

	@Test
	public void testGetLargestPallindrome() {
		
		Pallindrome objPallindrome = new Pallindrome();
		
		Assert.assertEquals(9009, objPallindrome.getLargestPallindrome(99));
		Assert.assertEquals(906609, objPallindrome.getLargestPallindrome(999));
		Assert.assertEquals(906609, objPallindrome.getLargestPallindrome(993));
		Assert.assertEquals(888888, objPallindrome.getLargestPallindrome(992));

		
	}
	
	
}
