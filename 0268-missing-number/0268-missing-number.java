class Solution {
    public int missingNumber(int[] nums) {
        int totalNums = nums.length;
        int sum = (totalNums * (totalNums+1))/2;
        for(int n: nums) {
            sum-=n;
        }
        return sum;
    }
}