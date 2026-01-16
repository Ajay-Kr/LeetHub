/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {
    intervals.sort((a, b) => {
      if(a[0] === b[0]) {
        return a[1] - b[1];
      }
      return a[0] - b[0]
    })
    const res = [];
    res.push(intervals[0]);
    /**
      2[0] >= 1[0] && 2[0] <= 1[1]
        ans -> [1[0],_]
        2[1] <= 1[1] -> ans.push 1[1]
        2[1] > 1[1]  -> ans.push 2[1]
     */
    for(let i = 1; i < intervals.length; i++) {
      const temp = [];
      const lastRes = res[res.length-1];
      if(intervals[i][0] >= lastRes[0] && intervals[i][0] <= lastRes[1]) {
        temp.push(lastRes[0]);
        if(intervals[i][1] <= lastRes[1])
          temp.push(lastRes[1]);
        else if(intervals[i][1] > lastRes[1]) 
          temp.push(intervals[i][1])
        
        res[res.length-1] = temp;
        continue;
      } else {
        res.push(intervals[i]);
      }
    }
    return res;

    /**
    [1,4],[2,3]
    2nd[0]>=1st[0] & 2nd[1]<1st[1] -> [1st[0], 1st[1]]
    [1,4],[1,3]

    [1,4],[0,4] -> [0,4],[1,4] -> [0,4]
    2nd[0] <= 1st[0] && 2nd[1] <= 1st[1] -> [1st[0], 2nd[1]]

    [[1, 3], [2, 6]
    2nd[0]>1st[0] & 2nd[0]<1st[1]

    [1,3],[3,3]
    [1,4],[3,3]
    // 2[0] cann't be < 1[0] since already sorted
    2[0] >= 1[0] && 2[0] <= 1[1]
      ans -> [1[0],_]
      2[1] <= 1[1] -> ans.push 1[1]
      2[1] > 1[1]  -> ans.push 2[1]
    
     */
};