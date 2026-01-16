/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    /**
      [2, 7, 11, 15] | 9
      
     */
     const seenMap = new Map();
     for(let i = 0; i < nums.length; i++) {
      const req = target - nums[i];
      if(seenMap.has(req)) {
        return [i, seenMap.get(req)]
      }
      seenMap.set(nums[i], i)
     }
};