class Solution {
    public int missingNumber(int[] nums) {
        int totalNums = nums.length;
        int reqSum = (totalNums * (totalNums+1))/2;
        int sum = 0;
        for(int n: nums) {
            sum+=n;
        }
        return reqSum-sum;
    }
}