package test;

import org.junit.Assert;
import org.junit.Test;

import examples.BalancedStr;

public class TestBalancedStr {
	
	BalancedStr balStr = new BalancedStr();
	
	@Test
	public void testBalanceAndCheck() {
		
		String exprs[] = { "<<>><<>>>>>>", 
							"<><>><>", 
							"<<>><",
							"<>><<>><",
							"",
							"<",
							">",
							">"
							};
    	int maxReps[] = { 8,
    						1,
    						1,
    						8,
    						1,
    						0,
    						1,
    						0
    						};
    	
    	
    	int expectedResults[] = { 1, 1, 0, 0, 1, 0, 1, 0};
    	
    	int[] actualResults =  balStr.balanceAndCheck(exprs, maxReps);
    	Assert.assertArrayEquals(expectedResults, actualResults);
    	
    	
	}
	
}
