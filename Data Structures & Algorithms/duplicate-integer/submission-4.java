class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int l = nums.length;
        Set<Integer> s = new HashSet(l);
        if (l <= 1) return false;
        for (int i=0;i<l;i++) {
            if (s.contains(nums[i])) return true;
            s.add(nums[i]);
        }
        return false;
    }
}