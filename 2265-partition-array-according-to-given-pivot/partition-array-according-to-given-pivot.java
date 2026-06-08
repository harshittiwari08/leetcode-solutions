class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i =0;
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num < pivot){
                ans[i] = num;
                i++;
            }
        }
        for(int num : nums){
            if(num == pivot){
                ans[i] = num;
                i++;
            }
        }
        for(int num : nums){
            if(num > pivot){
                ans[i] = num;
                i++;
            }
        }
        return ans;
    }
}