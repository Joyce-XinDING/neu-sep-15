import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateFinderTest {

	@Test
	public void test() {
		try{
		DuplicateFinder DF= new DuplicateFinder();
		int[] nums={1,1,2,3,4};
		assertEquals(true, DF.containsDuplicate(nums));
		int[] nums1={};
		assertEquals(false, DF.containsDuplicate(nums1));
		int[] nums2=null;
		DF.containsDuplicate(nums2);
		int[] nums3={-1,-1,0};
		assertEquals(true, DF.containsDuplicate(nums3));
		int[] nums4={0,0,0,0};
		assertEquals(true, DF.containsDuplicate(nums4));
		int[] nums5={0,0,1,1,1};
		assertEquals(true, DF.containsDuplicate(nums5));
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		
	}

}
}
