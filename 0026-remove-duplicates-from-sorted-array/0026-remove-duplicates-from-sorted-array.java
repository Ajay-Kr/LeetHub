class Solution {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int tempIdx = 0;
        int lastSeenN = nums[0];
        temp[tempIdx] = lastSeenN;
        for(int i = 0; i < nums.length; i++) {
          if(nums[i] != lastSeenN) {
            lastSeenN = nums[i];
            temp[++tempIdx] = lastSeenN;
          }
        }

        for(int i = 0; i < nums.length; i++) {
          nums[i] = temp[i];
        }

        return tempIdx+1;
    }
}