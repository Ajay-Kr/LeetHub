class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int[] tempArr = new int[len];
        int k = 0;
        for(int i = 0; i < len; i++) {
          if(nums[i] != val) {
            tempArr[k] = nums[i];
            k++;
          }
        }
        for(int i = 0; i < k; i++) {
          nums[i] = tempArr[i];
        }
        return k;
    }
}