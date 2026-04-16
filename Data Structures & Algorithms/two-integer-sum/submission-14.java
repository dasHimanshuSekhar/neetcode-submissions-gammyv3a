class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> mem = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            mem.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i ++){
            int complementSum = target - nums[i];
            if(mem.containsKey(complementSum) && mem.get(complementSum) != i) {
                ans[0] = i;
                ans[1] = mem.get(complementSum);
                break;
            }
        }
        return ans;
    }
}