class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int lastId = 0;
        for(int i = 1; i < nums.length; i++) {
          if(nums[i] != nums[lastId]) {
            nums[++lastId] = nums[i];
          }
        }

        return lastId+1;
    }
}