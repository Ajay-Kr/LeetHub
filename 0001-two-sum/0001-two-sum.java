class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
          final int req = target - nums[i];
          if(seen.containsKey(req)) {
            ans[0] = i;
            ans[1] = seen.get(req);
            return ans;
          }
          seen.put(nums[i], i);
        }

        return ans;
    }
}