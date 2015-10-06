import static org.junit.Assert.*;

import org.junit.Test;

public class MaxMinfinderTest {

	@Test
	public void testGetMax() {
		MaxMinfinder mf=new MaxMinfinder();
		int[] a={0,1,2,3,14};
		int b=mf.getMax(a);
		assertEquals(14,b);
	}

	@Test
	public void testGetMin() {
		MaxMinfinder mmf=new MaxMinfinder();
		int[] a={0,1,2,3,14};
		int c=mmf.getMin(a);
		assertEquals(0,c);
	}

}
