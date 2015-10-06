import static org.junit.Assert.*;

import org.junit.Test;

public class numdigitsTest {

	@Test
	public void testCount() {
		numdigits nd=new numdigits();
		int a=nd.count(14);
		assertEquals(2, a);
	}

}
