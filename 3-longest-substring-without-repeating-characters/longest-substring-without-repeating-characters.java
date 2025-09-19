import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> box = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++){
            char c = s.charAt(right); //kí tự tại right của chuỗi string, vd right = 0 thì s.charAt(right) là a
            while(box.contains(c)){  //exp1 abca -> xoa a ở đầu   //exp3 pwwkew
                box.remove(s.charAt(left)); //l1: bca             //l1: ww, l2: w
                left++;
            }
            box.add(c);
            maxLen = Math.max(maxLen, right - left + 1);  // abc right = 2 left = 0, kew right = 5 left = 3
        }
        return maxLen;
    }
}