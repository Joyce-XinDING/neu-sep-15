import static org.junit.Assert.*;

import org.junit.Test;

public class PatternTest {

	@Test
	public void test() {
		try{
		Pattern p=new Pattern();
		assertEquals(true,p.wordPattern("abab", "cat dog cat dog"));
		assertEquals(false,p.wordPattern("abab", "cat dog dog dog"));
		assertEquals(false,p.wordPattern("abba","dog cat cat fish"));
		assertEquals(false,p.wordPattern("aaaa","dog cat cat fish"));
		assertEquals(false,p.wordPattern("abba","cat cat cat cat"));
		assertEquals(false,p.wordPattern("abcd", "cat cat cat cat"));
	} catch(NullPointerException n){
		n.printStackTrace();
	} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		}
	}

}
