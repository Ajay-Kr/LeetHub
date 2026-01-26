class Solution {
    public int findDuplicate(int[] nums) {
        // int sum = Arrays.stream(nums).sum();
        // int uniqueNums = nums.length-1;
        // int shouldHaveSum = (uniqueNums*(uniqueNums+1)) / 2;
        // int ans = sum - shouldHaveSum;
        // return ans;

        int[] freqArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
          if(freqArr[nums[i]] > 0) {
            return nums[i];
          }
          freqArr[nums[i]]++;
        }

        return -1;
    }
}