package examples;


public class SmallestDivisible {
	
	public int getSmallestDivisible(int endNumber) {
		
		int retVal = 1;
		int[] arrayNumbers = new int[endNumber];
		for (int iLoop = 0; iLoop < endNumber; iLoop++) {
			arrayNumbers[iLoop] = iLoop + 1;		
		}
		int pivot = 2;
		while (pivot <= endNumber/2) {
			
				boolean isDivisible = false;
				for (int iLoop = 0; iLoop < endNumber; iLoop++) {
					if (arrayNumbers[iLoop]%pivot ==0 ) isDivisible = true;
				}
				
				if (isDivisible) {
					for (int iLoop = 0; iLoop < endNumber; iLoop++) {
						if (arrayNumbers[iLoop]%pivot == 0 ) {
							arrayNumbers[iLoop] = arrayNumbers[iLoop]/pivot;
						}
					}
					retVal = retVal * pivot;
					
				} else
					pivot++;		
		}
		
		for (int iLoop = 0; iLoop < endNumber; iLoop++) {
			retVal = retVal * arrayNumbers[iLoop];
		}
		
		System.out.println("The GCD Value is "+ retVal);
		
		
		
		return retVal;
		
	}
}
