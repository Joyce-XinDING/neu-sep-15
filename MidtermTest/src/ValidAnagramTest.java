import static org.junit.Assert.*;

import org.junit.Test;

public class ValidAnagramTest {

	@Test
	public void test() {
			String a="anagram";
			String b="nagaram";
			ValidAnagram VA=new ValidAnagram();
			assertEquals(true, VA.isAnagram(a, b));
			String c="rat";
			String d="car";
			assertEquals(false, VA.isAnagram(c, d));
			String e="anagram";
			String f="nagarem";
			assertEquals(false, VA.isAnagram(e, f));
			String g="f";
			String h="ff";
			assertEquals(false, VA.isAnagram(g, h));
			String i=" ";
			String j=" ";
			assertEquals(true, VA.isAnagram(i, j));
		}
	}


