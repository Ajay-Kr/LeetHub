class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] freqArr = new boolean[nums.length];
        for(int num: nums) {
          if(freqArr[num]) {
            return num;
          }
          freqArr[num] = true;
        }
        return -1;
    }
}