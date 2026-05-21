class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[A.length];
        int count = 0;
        for(int i=0; i<A.length; i++){
            if(set.contains(A[i]) == false)
                set.add(A[i]);
            else
                count++;
            if(set.contains(B[i]) == false)
                set.add(B[i]);
            else
                count++;
            ans[i] = count;
        }
        return ans;
    }
}