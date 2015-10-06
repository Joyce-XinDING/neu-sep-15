import static org.junit.Assert.*;

import org.junit.Test;

public class findTest {

	@Test
	public void test() {
		find f=new find();
		int a=f.count("apple", 'p');
		assertEquals(2,a);
		
	}

}
