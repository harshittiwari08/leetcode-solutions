class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        for(int i = 0; i<nums1.length; i++)
            n1.add(nums1[i]);
        for(int i = 0; i<nums2.length; i++)
            n2.add(nums2[i]);
        for(int num : n1){
            if(!n2.contains(num))
                x.add(num);
        }
        for(int num : n2){
            if(!n1.contains(num))
                y.add(num);
        }
        ans.add(x); 
        ans.add(y); 
        return ans;
    }
}