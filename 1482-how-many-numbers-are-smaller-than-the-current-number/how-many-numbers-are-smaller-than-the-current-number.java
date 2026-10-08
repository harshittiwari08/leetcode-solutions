class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int max = nums[0];
        for(int i = 1; i< nums.length; i++){
            if(nums[i]>max)
                max = nums[i];
        }
        int[] count = new int[max+1];
        for(int i = 0; i<nums.length; i++)
            count[nums[i]]++;
        
        int[] sum = new int[max+1];
        for(int i = 1; i<= max; i++)
            sum[i] = sum[i-1]+count[i-1];
        
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++)
            res[i] = sum[nums[i]];
        
        return res;
    }
}