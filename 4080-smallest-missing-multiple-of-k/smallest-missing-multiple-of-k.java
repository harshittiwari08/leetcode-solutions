class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int ans =k;
        int n = nums.length;
        for(int i= 0; i<nums.length;i++)
            set.add(nums[i]);
        while(n>0){
            if(set.contains(ans) == false)
                return ans;
            ans+=k;
            n--;
        }
        return ans;
    }
}