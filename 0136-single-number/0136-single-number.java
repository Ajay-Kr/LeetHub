class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)  {
            sum += num;
            set.add(num);
        }
        int uniqueSum = 0;
        for(int num : set) {
            uniqueSum += num;
        }
        int ans = 2 * uniqueSum - sum;
        return ans;
    }
}