
import static org.junit.Assert.*;
import org.junit.Test;

public class EvenNumberTest extends EvenNumber {

	@Test
	public void testDisplay() {
		EvenNumber d=new EvenNumber();
		int[] x={2,4,6,8,10,12,14};
		int[] c=d.display(14);
		assertArrayEquals(x, c);
	}
}
