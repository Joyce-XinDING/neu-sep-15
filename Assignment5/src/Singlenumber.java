import java.util.*;
/*
 * P1.
Given an array of integers, every element appears twice except for one. Find that single one.
 */

class Singlenumber {
      
    public int singleNumber(int[] A) throws NullPointerException{
    	
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
            	map.put(A[i], 1);
            }
            else map.remove(A[i]);
        }
        int res = 0;
        for (Integer key : map.keySet()) res = key;
        return res;
    }
}