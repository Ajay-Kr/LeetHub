/**
 * @param {string[]} nums
 * @param {number[][]} queries
 * @return {number[]}
 */
 smallestTrimmedNumbers = function(nums, queries) {
    const answer = [];
    for(let i = 0; i < queries.length; i++){
      const [k, toTrim] = queries[i];
      const strLen = nums[0].length;
      const trimmedArray = nums
                              .map((n, idx) => [BigInt(n.substring(strLen-toTrim)), idx])
                              .sort((a, b) => {
                                if(a[0] == b[0]) {
                                  return a[1] < b[1] ? -1 : a[1] > a[1] ? 1 : 0;
                                }
                                return a[0] < b[0] ? -1 : a[0] > a[0] ? 1 : 0;
                              });
      answer.push(trimmedArray[k - 1][1])
    }

    return answer;
};