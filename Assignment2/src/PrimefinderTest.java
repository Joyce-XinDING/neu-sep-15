import static org.junit.Assert.*;

import org.junit.Test;

public class PrimefinderTest {

	@Test
	public void testFindPrime() {
		Primefinder pf=new Primefinder();
		boolean a=pf.findPrime(14);
		assertFalse(a);
	}
}
