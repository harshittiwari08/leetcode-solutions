class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0; i< nums1.length; i++)
        //     set.add(nums1[i]);
        // for(int i = 0; i< nums2.length; i++){
        //     if(set.contains(nums2[i]))
        //         return nums2[i];
        // } 
        int p1 = 0;
        int p2 = 0;
        while(p1 != nums1.length && p2 != nums2.length){
            if(nums1[p1] > nums2[p2])
                p2++;
            else if(nums1[p1] < nums2[p2])
                p1++;
            else
                return nums1[p1];
        }
        return -1;
    }
}