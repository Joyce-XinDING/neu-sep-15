import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void test() {
		MyStack MS=new MyStack();
		MS.push(1);
		MS.push(2);
		MS.push(3);
		int a=MS.top();
		assertEquals(3, a);
		int b=MS.pop();
		assertEquals(3, b);
		int c=MS.top();
		assertEquals(2, c);
		MS.pop();
		MS.pop();
		assertEquals(true, MS.empty());
	}

}
