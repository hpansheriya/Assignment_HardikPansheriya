package testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.Calculation;

public class TestLogic
{
	@Test
	public void testFindMax() {
		assertEquals(4,Calculation.findMax(new int[] {1,3,4,2}));
//		assertEquals(-1, Calculation.findMax(new int[] {-3,-1,-5,0,1,10}));
	}
	
	@Test
	public void testReverseString() {
		assertEquals("kidraH ", Calculation.reverseString("Hardik"));
	}
}
