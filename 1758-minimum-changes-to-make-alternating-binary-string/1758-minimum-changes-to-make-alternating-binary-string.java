class Solution {
    public int minOperations(String s) {
        int sLen = s.length();
        String mask1 = "";
        String mask2 = "";
        for(int i = 0; i < sLen; i++) {
          mask1 += i%2 == 0 ? "0" : "1";
          mask2 += i%2 == 0 ? "1" : "0";
        }
        
        int count1=0, count2=0;
        for(int i = 0; i < sLen; i++) {
          count1 += (s.charAt(i) ^ mask1.charAt(i));
          count2 += (s.charAt(i) ^ mask2.charAt(i));
        }

        if(count1 < count2) return count1;
        return count2;
    }
}