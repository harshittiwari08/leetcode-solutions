class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length)
            k = k%nums.length;
        rotation(nums, 0, nums.length-k-1);
        rotation(nums, nums.length-k, nums.length-1);
        rotation(nums, 0, nums.length-1);
    }
    public static int[] rotation(int[] nums, int a, int b){
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
        return nums;
    }
}