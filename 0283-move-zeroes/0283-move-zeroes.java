class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=1;
        while(i < nums.length && j < nums.length) {
            if(nums[i] == 0) {
                if(nums[j] == 0) {
                    while(j < nums.length && nums[j] == 0) j++;
                }
                if(j < nums.length && nums[j] != 0) {
                    nums[i] = nums[j]; 
                    nums[j] = 0;
                }
            }
            i++;
            j++;
        }
    }
}