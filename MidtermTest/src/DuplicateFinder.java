import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {
	public boolean containsDuplicate(int[] nums) throws NullPointerException{
	
	     Set<Integer> s = new HashSet<>();
	     for(int n : nums){
	           if(s.contains(n)){
	                return true;
	            }

	            s.add(n);
	        }
	        return false;
	    }
}
