import static org.junit.Assert.*;

import org.junit.Test;

public class CapitalTest {

	@Test
	public void test() {
		Capital cp=new Capital();
		String a="siva is a good teacher!";
		cp.firstLetterToUpper(a);
		String b=cp.firstLetterToUpper(a);
		assertEquals("Siva Is A Good Teacher!", b);
	}

}
