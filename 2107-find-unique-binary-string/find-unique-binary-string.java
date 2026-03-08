class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            if(nums[i].charAt(i) == '0'){
                temp.append('1');
            }else{
                temp.append('0');
            }
        }
        return temp.toString();
    }
}