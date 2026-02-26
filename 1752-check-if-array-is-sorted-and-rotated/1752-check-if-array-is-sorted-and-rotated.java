class Solution {
    public boolean check(int[] nums) {
        int dipIndex = 0; 
        for(int i = 1; i < nums.length; i++) {
          if(nums[i] >= nums[i-1]) {
            continue;
          } else if(nums[i] <= nums[0]){
            dipIndex = i;
            break;
          } else return false;
        }

        if(dipIndex > 0) {
          for(int i = dipIndex+1; i < nums.length; i++) {
            if(nums[i] >= nums[i-1] && nums[i] <= nums[0]) continue;
            else return false; 
          }
        }

        return true;
    }
}