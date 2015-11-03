import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person XinDing=new Person("Xin", "Ding");
		Person SivaDosapati= new Person("Siva","Dosapati");
		Person Joyce=XinDing;
		Person Cva=SivaDosapati;
		assertEquals(0, XinDing.compareTo(Joyce));
		assertEquals(0, SivaDosapati.compareTo(Cva));
		assertEquals(-1, XinDing.compareTo(SivaDosapati));
		assertEquals(1, SivaDosapati.compareTo(XinDing));
		assertEquals(true, XinDing.equals(Joyce));
		assertEquals(false, XinDing.equals(Cva));
		assertEquals(XinDing.hashCode(), Joyce.hashCode());
		assertEquals("XinDing", Joyce.tostring());
	}
	

}
