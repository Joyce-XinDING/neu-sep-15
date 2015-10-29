import static org.junit.Assert.*;

import org.junit.Test;

public class Move0sTest {

	@Test
	public void test() {
		try{
			Move0s M=new Move0s();
			assertArrayEquals(new int[]{1, 3, 12, 0, 0}, M.moveZeroes(new int[]{0, 1, 0, 3, 12}));
			assertArrayEquals(new int[]{}, M.moveZeroes(new int[]{}));
			M.moveZeroes(null);
			assertArrayEquals(new int[]{1,1,100,10,900}, M.moveZeroes(new int[]{1,0,1,0,100,10,900}));
			assertArrayEquals(new int[]{0,0,0,0,1}, M.moveZeroes(new int[]{1,0,0,0,0}));
			assertArrayEquals(new int[]{1, 3, 12, 10, 10}, M.moveZeroes(new int[]{1,3,12,10,10}));
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
	}

}
