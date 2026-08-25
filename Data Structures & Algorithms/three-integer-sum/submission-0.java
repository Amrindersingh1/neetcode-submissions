class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList();
        if(nums.length<3) return ans;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
           if (i > 0 && nums[i] == nums[i - 1]) continue;

           int j = i+1;
           int k = nums.length - 1;
           int target = -nums[i];

            while(j<k) {
                int currsum = nums[j]+nums[k];
                if(currsum == target) {
                    List<Integer> currans = new ArrayList();
                    currans.add(nums[i]);
                    currans.add(nums[j]);
                    currans.add(nums[k]);
                    ans.add(currans);
                    j++; k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;   // skip dup L
                    while (j < k && nums[k] == nums[k + 1]) k--;   // skip dup R
                }
                else if (currsum > target) k--;
                else j++;
            }

            
        }
        

        return ans;
    }
}

// -4 -1 -1 0 1 2