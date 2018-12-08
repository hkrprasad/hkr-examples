package examples;
/*
 *  Problem 9: Special Pythagorean triplet
 *  
 *  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 */

public class SpecialPythagoreanTriplet {
	
	public int getSpecialPyTripletProduct(int sumTriplets) {
		int tripletProduct = 1;
		int a = 1, b =2, c = 3;
		
		for (int iLoop = 1; iLoop < sumTriplets/3; iLoop++) {
			
			for (int jLoop = iLoop+1; iLoop+jLoop <= (sumTriplets*2)/3; jLoop++) {
				
				int tempC = sumTriplets - iLoop - jLoop;
			//	System.out.print("The numbers are " + iLoop + ", "+ jLoop + ", "+tempC);
			//	System.out.println("  The product is : " + tempC*tempC);
				
				if (tempC*tempC == (iLoop*iLoop + jLoop*jLoop)) {
					
					tripletProduct = tempC * iLoop *jLoop;
					
					System.out.println("The Special Pythagorean triplets are : " + iLoop + ", " + jLoop + ", "+tempC);
				}
				
				
			}
		}
		
		
		return tripletProduct;
	}
	
	

}
