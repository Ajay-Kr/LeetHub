class Solution {
    public int findDuplicate(int[] nums) {
        // int sum = Arrays.stream(nums).sum();
        // int uniqueNums = nums.length-1;
        // int shouldHaveSum = (uniqueNums*(uniqueNums+1)) / 2;
        // int ans = sum - shouldHaveSum;
        // return ans;

        boolean[] freqArr = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++) {
          if(freqArr[nums[i]]) {
            return nums[i];
          }
          freqArr[nums[i]] = true;
        }

        return -1;
    }
}