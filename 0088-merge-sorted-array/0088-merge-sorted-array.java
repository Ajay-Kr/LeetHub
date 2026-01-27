class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) {
          return;
        }
        int cur = nums1.length-1;
        m--;
        n--;
        while(n >= 0 && m >= 0) {
          if(nums2[n] > nums1[m]) {
            nums1[cur] = nums2[n];
            n--;
          } else {
            nums1[cur] = nums1[m];
            m--;
          }
          cur--;
        }
        if(n >=0) {
          for(int i = 0; i <= n; i++) {
            nums1[i] = nums2[i];
          }
        }
    }
}