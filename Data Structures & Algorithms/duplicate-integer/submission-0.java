class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        if (l <= 1) return false;
        for (int i=1;i<l;i++) {
            if (nums[i]==nums[i-1]) return true;
        }
        return false;
    }
}