import java.util.HashSet;
import java.util.Set;
/*
 * use target to minus.
 */
public class Twosum {
	public boolean twoSum(int[] nums, int target) throws NullPointerException{
		
		Set<Integer> s = new HashSet<>();
		for(int n:nums){
			if(s.contains(target-n)){
				return true;
			}
			s.add(n);
		}
		return false;
		
	}
}
