class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> ans = new HashMap<>();
       for(int i=0; i<nums.length; i++){
        if(ans.containsKey(nums[i])){
            ans.put(nums[i], ans.get(nums[i])+1);
        }
        else
            ans.put(nums[i], 1);
       }
       for(int key : ans.keySet()){
            int freq = ans.get(key);
            if(freq > nums.length/2)
                return key;
       }
       return 0;
    }
}