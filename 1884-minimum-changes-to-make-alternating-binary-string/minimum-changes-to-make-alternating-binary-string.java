class Solution {
    public int minOperations(String s) {
        int case1 = 0;
        int case2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != (i % 2 == 0 ? '0' : '1'))
                case1++;
            if(s.charAt(i) != (i % 2 == 0 ? '1' : '0'))
                case2++;
        }
        return Math.min(case1, case2);
    }
}