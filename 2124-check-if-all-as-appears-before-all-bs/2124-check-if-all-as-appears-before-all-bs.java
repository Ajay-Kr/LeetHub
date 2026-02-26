class Solution {
    public boolean checkString(String s) {
      int count = 0; 
      for(int i = 1; i < s.length(); i++) {
        if(s.charAt(i) != s.charAt(i-1)) {
          if(s.charAt(i-1) != 'a') return false;

          count++;
        }
      }

      return count <= 1;
    }
}