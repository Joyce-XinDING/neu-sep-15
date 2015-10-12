import static org.junit.Assert.*;

import org.junit.Test;

public class ReserverTest {

	@Test
	public void test() {
		Reserver rs=new Reserver();
		assertEquals("teacher good a is Siva", 
				rs.back("Siva is a good teacher"));
	}

}
