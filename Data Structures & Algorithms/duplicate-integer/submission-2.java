class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet();
        int l = nums.length;
        if (l <= 1) return false;
        for (int i=0;i<l;i++) {
            if (s.contains(nums[i])) return true;
            s.add(nums[i]);
        }
        return false;
    }
}