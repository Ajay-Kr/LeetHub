class Solution {
  public int findClosestNumber(int[] nums) {
    int closest = nums[0];
    // for(int num: nums) {
    //     if(Math.abs(num) < Math.abs(closest) || 
    //         (Math.abs(num) == Math.abs(closest) && num > closest)) {
    //             closest = num;
    //         }
    // }
    for(int num: nums)
        if(closest<=0 && num<=0 && num>closest)
          closest = num;
        else if(closest<=0 && num>=0 && -closest>=num)
          closest = num;
        else if(closest>=0 && num<=0 && closest>-num)
          closest = num;
        else if(closest>=0 && num>=0 && closest>num) 
          closest = num;
      return closest;
  }
}