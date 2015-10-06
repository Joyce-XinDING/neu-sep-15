import static org.junit.Assert.*;

import org.junit.Test;

public class findaTest {

	@Test
	public void test() {
		finda fa=new finda();
		int a=fa.count("apple");
		assertEquals(1,a);
	}

}
