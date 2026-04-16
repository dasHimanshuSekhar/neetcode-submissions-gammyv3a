class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> mem = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            mem.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i ++){
            // int complementSum = ;
            if(mem.containsKey(target - nums[i]) && mem.get(target - nums[i]) != i) {
                return new int[]{i, mem.get(target - nums[i])};
            }
        }
        return ans;
    }
}