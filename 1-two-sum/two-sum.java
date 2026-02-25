class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int need = target - curr;
            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }
            map.put(curr, i);
        }
        return new int[]{}; //2 1 2    3
    }
}