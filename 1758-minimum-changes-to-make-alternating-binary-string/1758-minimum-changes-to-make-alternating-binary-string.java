class Solution {
    public int minOperations(String s) {
        int sLen = s.length();
        
        int count1=0, count2=0;
        for(int i = 0; i < sLen; i++) {
          char mask1 = i%2 == 0 ? '0' : '1';
          char mask2 = i%2 == 0 ? '1' : '0';
          count1 += (s.charAt(i) ^ mask1);
          count2 += (s.charAt(i) ^ mask2);
        }

        if(count1 < count2) return count1;
        return count2;
    }
}