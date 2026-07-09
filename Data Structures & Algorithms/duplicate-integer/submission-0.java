class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> isPresent = new HashSet<>();
        for(int num:nums) {
            if(isPresent.contains(num))
                return true;
            isPresent.add(num);
        }
        return false;
    }
}