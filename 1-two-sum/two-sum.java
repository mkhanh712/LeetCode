class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if(nums[j] + nums[j-i] == target){ // 1 0 2 1 3 2 / 2 1 3
                    return new int[]{j-i,j};
                }
            }
        }
        return null;
    }
}