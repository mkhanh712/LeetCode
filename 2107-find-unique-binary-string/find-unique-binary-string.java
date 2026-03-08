class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            temp.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        return temp.toString();
    }
}