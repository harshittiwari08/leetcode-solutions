class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int j= 0;
        int k = 0;
        int start= 0;
        int end = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] > 0){
                pos[j] = nums[i];
                j++;
            }
        }
        for(int i =0; i< nums.length; i++){
            if(nums[i] < 0){
                neg[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i< nums.length; i++){
            if(i%2==0){
                nums[i] = pos[start];
                start++;
            }
            else{
                nums[i] = neg[end];
                end++;
            }
        }
        return nums;
    }
}