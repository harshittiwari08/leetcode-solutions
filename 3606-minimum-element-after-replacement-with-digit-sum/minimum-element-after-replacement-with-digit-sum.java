class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            nums[i] = sum(nums[i]);
            if(nums[i] < min)
                min = nums[i];
        }
        return min;
    }
    public int sum(int n){
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}