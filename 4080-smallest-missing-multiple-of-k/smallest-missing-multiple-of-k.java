class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int temp = k;
        for(int i = 0; i<nums.length; i++)
            set.add(nums[i]);
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(k))
                return k;
            k+=temp;
        }
        return k;
    }
}