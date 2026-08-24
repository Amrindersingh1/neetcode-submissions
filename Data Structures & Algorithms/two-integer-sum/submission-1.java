class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> s = new HashMap(nums.length);
        for (int i = 0; i < nums.length;i++) {
            int d = target - nums[i];
            if (s.containsKey(d)) return new int[]{s.get(d), i}; 
            s.put(nums[i], i);
        }
        return new int[0];
    }
}
