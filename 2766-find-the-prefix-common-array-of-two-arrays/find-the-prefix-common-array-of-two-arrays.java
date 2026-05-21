class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int[] ans = new int[A.length];
        int count = 0;
        for(int i=0; i<A.length; i++){
            setA.add(A[i]);
            setB.add(B[i]);
            if(setA.contains(B[i]))
                count++;
            if(setB.contains(A[i]))
                count++;
            if(A[i] == B[i])
                count--;
            ans[i] = count;
        }
        return ans;
    }
}