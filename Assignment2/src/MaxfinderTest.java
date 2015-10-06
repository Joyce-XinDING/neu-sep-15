import static org.junit.Assert.*;

import org.junit.Test;

public class MaxfinderTest {

	@Test
	public void test() {
		Maxfinder mf=new Maxfinder();
		int[] a={0,1,2,3,14};
		int b=mf.getMax(a);
		assertEquals(14,b);
		
	}

}
