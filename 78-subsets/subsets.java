class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        soln(0, nums, new ArrayList<Integer>(), res);
        return res;
    }
    public static void soln(int i, int nums[], List<Integer> curr, List<List<Integer>> res){
        if(nums.length == i){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(nums[i]);
        soln(i+1, nums, curr, res);
        curr.remove(curr.size()-1);
        soln(i+1, nums, curr, res);
    }
}