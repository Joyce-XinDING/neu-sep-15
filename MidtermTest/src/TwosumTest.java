import static org.junit.Assert.*;

import org.junit.Test;

public class TwosumTest {

	@Test
	public void test() {
		try{
		Twosum s=new Twosum();
		int[] nums= {2,7,11,15};
		int target=9;
		assertEquals(true, s.twoSum(nums, target));
		int[] nums1={2,7,11,15};
		int target1=10;
		assertEquals(false, s.twoSum(nums1, target1));
		int[] nums2=null;
		int target2=0;
		s.twoSum(nums2, target2);
		int[] nums3={0,0,1};
		int target3=0;
		assertEquals(true, s.twoSum(nums3, target3));
		int[] nums4={1,1,1,1};
		int target4=4;
		assertEquals(false, s.twoSum(nums4, target4));
		int[] nums5={-1,1,0};
		int target5=0;
		assertEquals(true, s.twoSum(nums5, target5));
		int[] nums6={-2,-2,2};
		int target6=-4;
		assertEquals(true, s.twoSum(nums6, target6));
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

}
