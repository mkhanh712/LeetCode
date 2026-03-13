class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
         r0 m1, r1 m2, r2 l=1+1=2 m2, r3 l=0+1=1,
         */
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int left = 0, right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}