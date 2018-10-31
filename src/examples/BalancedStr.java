package examples;

import java.util.Stack;

public class BalancedStr {
	
	public int[] balanceAndCheck(String[] expressions, int[] maxReplacements) {
        
    	/**
    	 *  Assuming that expressions.length and maxReplacements.length
    	 * are not null and are of the same size
    	*/

    	//Number of strings that we are dealing with
    	int sizeOfExprs = expressions.length; 
    	// Return array
    	int retArr[] = new int[sizeOfExprs];
    	char leftBr = '<';
    	
    	// This is to ensure that the maxReplacement array is greater than or equal
    	// to the expression array
    	// If not, will assume the maxReplacement is 0
    	int newMaxReplacements[] = new int[sizeOfExprs];
    	for (int initRep_i = 0; (initRep_i <sizeOfExprs ) && (initRep_i < maxReplacements.length ); initRep_i++) {
    		newMaxReplacements[initRep_i] = maxReplacements[initRep_i];
    	}
    	
    	//Looping through each of the strings provided as input
    	for (int strLoop_i = 0; strLoop_i < sizeOfExprs; strLoop_i++) { 

    		StringBuffer oneExpr = new StringBuffer(expressions[strLoop_i]);
    		int exprLen = oneExpr.length();

    		int iReplacements = 0;
    		int leftCount = 0;
    		// Loop through each char in the string	
    		for (int chrLoop_i = 0 ; chrLoop_i < exprLen; chrLoop_i++) {
    			
    			// If we get a < add it to the stack
    			if (oneExpr.charAt(chrLoop_i) == leftBr) {  
    				leftCount++;
    			
    			// It is a > and if it has a matching >, pop it out
    			} else if (leftCount > 0){ 
    				leftCount--;
    			} else // It is a > and no matching > found in stack, so replace it with <>
    				iReplacements++;
    			
    			//Don't bother going further if we have replaced more than permitted
    			if (iReplacements > newMaxReplacements[strLoop_i]) break;
    		
    		}
    		
    		//tempStack is non-empty if it has an unmatched <
    		if ((leftCount > 0) ||( iReplacements > newMaxReplacements[strLoop_i])) {		
    			retArr[strLoop_i] = 0;
    		} else {
    			retArr[strLoop_i] = 1;
    		}	
    	}
  
    	return retArr;
	}

}
