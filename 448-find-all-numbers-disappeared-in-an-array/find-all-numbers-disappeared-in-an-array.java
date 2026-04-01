import java.util.*;
class Solution {  
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> misno= new ArrayList<>();
       for(int i=0;i<nums.length;i++){
            int in=Math.abs(nums[i])-1;
            if(nums[in]>0){
                nums[in]*=-1;
            }
       }
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0)
            misno.add(i+1);
        }
        return  misno;
    }
}   