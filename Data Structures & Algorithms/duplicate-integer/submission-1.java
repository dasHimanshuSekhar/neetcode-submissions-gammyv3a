class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> duplicateTrackerMap = new HashMap<>();

        for(int i = 0; i < nums.length; i ++ ){
            if(duplicateTrackerMap.get(nums[i]) != null && !duplicateTrackerMap.get(nums[i])){
                return true;
            }
            Boolean duplicateCheck = false;
            duplicateTrackerMap.put(nums[i], duplicateCheck);
        }
        return false;
    }
}