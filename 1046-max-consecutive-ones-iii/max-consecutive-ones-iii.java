class Solution {
    public int longestOnes(int[] nums, int k) {
        int c = 0;
        int j = -1;
        int i = 0;
        int max = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                c++;
                i++;
            }
            else
                i++;

            while(c > k){
                j++;
                if(nums[j] == 0)
                    c--;
            }
            max = Math.max(max, i - j - 1);
        }
        return max;
    }
}