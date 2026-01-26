class Solution {
    public int findDuplicate(int[] nums) {
        // int sum = Arrays.stream(nums).sum();
        // int uniqueNums = nums.length-1;
        // int shouldHaveSum = (uniqueNums*(uniqueNums+1)) / 2;
        // int ans = sum - shouldHaveSum;
        // return ans;

        // int[] freqArr = new int[nums.length];
        // for(int i = 0; i < nums.length; i++) {
        //   if(freqArr[nums[i]] > 0) {
        //     return nums[i];
        //   }
        //   freqArr[nums[i]]++;
        // }

        // return -1;

        int slow=0;
        int fast = 0;

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }
        int slow2 = 0;
        while (true) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow == slow2){
                return slow;
            }
        }
    }
}