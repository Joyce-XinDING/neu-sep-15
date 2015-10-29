import static org.junit.Assert.*;

import org.junit.Test;

public class DividerTest {

	@Test
	public void test() {
		Divider D= new Divider();
		assertEquals("fizz buzz", D.printFizzBuzz(0));
		assertEquals("fizz buzz", D.printFizzBuzz(15));
		assertEquals("", D.printFizzBuzz(-1));
		assertEquals("fizz ", D.printFizzBuzz(-3));
		assertEquals("buzz", D.printFizzBuzz(500000000));
	}

}
