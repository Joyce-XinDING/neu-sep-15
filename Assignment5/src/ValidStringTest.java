import static org.junit.Assert.*;

import org.junit.Test;

public class ValidStringTest {

	@Test
	public void test() {
		ValidString VS= new ValidString();
		String s1="()";
		assertEquals(true, VS.isValid(s1));
		String s2=null;
		assertEquals(false, VS.isValid(s2));
		String s3="[{(]})";
		assertEquals(false, VS.isValid(s3));
		String s4="[]{}()";
		assertEquals(true, VS.isValid(s4));
		String s5="({[";
		assertEquals(false, VS.isValid(s5));
	}

}
