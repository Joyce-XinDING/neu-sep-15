public class Move0s {
/*
 * for each time detects a zero, shift to the back non-zero point.
 */
    void shiftLeft(int[] nums, int p, final int c){
        if(c <= 0) return;
        while(p < nums.length){
            nums[p - c] = nums[p];
            if(nums[p] == 0) break;
            p++;
        }
        for(int i = p - c; i < p; i++){
            nums[i] = 0;
        }
    }
    public int[] moveZeroes(int[] nums) throws NullPointerException {

        int i = nums.length - 1;
        while(i >= 0 && nums[i] == 0) 
        	i--;
        int s = i;
        boolean metzero = false;
        while(i >= 0){
            if(nums[i] != 0){
                if(metzero){
                    shiftLeft(nums, s, s - i - 1);
                    metzero = false;
                }
                s = i;
            } else {
                metzero = true;
            }
            i--;
        }
        shiftLeft(nums, s, s);
        return nums;
     }
     
}