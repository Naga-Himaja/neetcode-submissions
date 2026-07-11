class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;++i) {
            int num = nums[i];
            if(set.contains(target-num)) {
                ans[1] = i;
                for(int j=0;j<i;++j) {
                    if(nums[j] == target-num)
                        ans[0] = j;
                }
                return ans;
            }
            set.add(num);
        }
        return ans;
    }
}
