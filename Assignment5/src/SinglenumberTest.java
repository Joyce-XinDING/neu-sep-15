import static org.junit.Assert.*;

import org.junit.Test;

public class SinglenumberTest {

	@Test
	public void test() {
		Singlenumber S=new Singlenumber();
		assertEquals(3, S.singleNumber(new int[] {1,1,2,2,3}));
		assertEquals(0, S.singleNumber(new int []{1,1,0}));
		assertEquals(5, S.singleNumber(new int[] {1,2,3,4,5,4,3,2,1}));
		assertEquals(1, S.singleNumber(new int[]{1}));
		try{
			S.singleNumber(null);
		}
		catch(NullPointerException e){
		e.printStackTrace();
	}
	}
}
