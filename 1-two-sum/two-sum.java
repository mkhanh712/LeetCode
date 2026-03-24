class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int need = 0;
        for(int r = 0; r < nums.length; r++){
            int curr = nums[r];
            need = target - curr;
            if(map.containsKey(need)){
                return new int[]{map.get(need), r};
            }
            map.put(curr, r);
        }
        return new int[]{};
    }
}