class Solution {
    public long minArraySum(int[] nums) {
        
        int max = nums[0];
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>max)
                max = nums[i];
        }
        int[] sieve = new int[max+1];
        for(int num : nums){
            sieve[num] += 1;
        }
        for(int i = 0; i<=max; i++){
            if(sieve[i] == 0)
                continue;
            for(int j = i; j<= max; j+=i){
                if(sieve[j] > 0){
                    sum+=1L* sieve[j]*i;
                    sieve[j] = 0;
                }
            }
        }
        return sum;
    }
}