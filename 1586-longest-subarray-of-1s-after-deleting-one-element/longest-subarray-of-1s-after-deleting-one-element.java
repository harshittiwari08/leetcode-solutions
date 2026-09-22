class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = -1;
        int c = 0;
        int max = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                c++;
                i++;
            }
            else{
                i++;
            }
            while(c > 1){
                j++;
                if(nums[j] == 0)
                    c--;
            }
            max = Math.max(max, i-j-2);
        }
        return max;
    }
}