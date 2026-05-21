class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int[] ans = new int[A.length];
        int count = 0;
        for(int i=0; i<A.length; i++){
            if(set.containsKey(A[i]) == false)
                set.put(A[i],1);
            else
                count++;
            if(set.containsKey(B[i]) == false)
                set.put(B[i],1);
            else
                count++;
            ans[i] = count;
        }
        return ans;
    }
}