package examples;

import org.junit.*;

public class TestSpecialPythagoreanTriplet {
	
	@Test
	public void testGet() {
		
		
		SpecialPythagoreanTriplet spt = new SpecialPythagoreanTriplet();
		
		Assert.assertEquals(480, spt.getSpecialPyTripletProduct(24));
		Assert.assertEquals(3840, spt.getSpecialPyTripletProduct(48));
		Assert.assertEquals(30720, spt.getSpecialPyTripletProduct(96));
		Assert.assertEquals(780, spt.getSpecialPyTripletProduct(30));
		Assert.assertEquals(1, spt.getSpecialPyTripletProduct(50));
		Assert.assertEquals(1, spt.getSpecialPyTripletProduct(100));
		Assert.assertEquals(255000, spt.getSpecialPyTripletProduct(200));
		Assert.assertEquals(2040000, spt.getSpecialPyTripletProduct(400));
		Assert.assertEquals(1, spt.getSpecialPyTripletProduct(500));

		Assert.assertEquals(12187500, spt.getSpecialPyTripletProduct(750));
		Assert.assertEquals(31875000, spt.getSpecialPyTripletProduct(1000));
		Assert.assertEquals(255000000, spt.getSpecialPyTripletProduct(2000));
		Assert.assertEquals(117187500, spt.getSpecialPyTripletProduct(1500));

	}
	

}
