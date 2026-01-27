class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexValueMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
          int rem = target - nums[i];
          if(indexValueMap.containsKey(rem)) {
            return new int[]{i, indexValueMap.get(rem)};
          }
          indexValueMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}