class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        if((k % nums.length) == nums.length) return;
        if(nums.length == 1) return;

        int rev = k%nums.length;
        reverse(nums, 0, nums.length-rev-1);
        reverse(nums, nums.length-rev, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}