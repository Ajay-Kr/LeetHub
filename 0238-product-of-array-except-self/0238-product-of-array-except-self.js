/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const ans = [];
    const prefixProducts = [];
    const suffixProducts = [];
    let prefixProduct = 1;
    for(let i = 0; i < nums.length; i++) {
      prefixProduct *= nums[i];
      prefixProducts[i] = prefixProduct;
    }
    let suffixProduct = 1;
    for(let i = nums.length-1; i >= 0; i--) {
      suffixProduct *= nums[i];
      suffixProducts[i] = suffixProduct;
    }

    ans[0] = suffixProducts[1];
    for(let i = 1; i < nums.length-1; i++) {
      ans[i] = prefixProducts[i-1] * suffixProducts[i+1];
    }

    ans[nums.length-1] = prefixProducts[nums.length-2];

    return ans;
};