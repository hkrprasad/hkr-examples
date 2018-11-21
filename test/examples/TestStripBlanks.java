package examples;

import org.junit.Assert;
import org.junit.Test;

public class TestStripBlanks {
	
	@Test
	public void testRemoveBlanks(){
		StripBlanks strpBlanks = new StripBlanks();
		String testString = "   This    is a crazy     world    ";
		String expectedResult = "sihT si a yzarc dlrow";
		
		String actualResult = strpBlanks.removeBlanks(testString);
		Assert.assertEquals( "Strings are matching", expectedResult, actualResult);
		
		
	}

}
