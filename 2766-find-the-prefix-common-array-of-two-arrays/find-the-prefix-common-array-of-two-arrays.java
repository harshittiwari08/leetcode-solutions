class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int[] ans = new int[A.length];
        int count = 0;
        for(int i=0; i<A.length; i++){
            // if(set.containsKey(A[i]))
            //     set.put(A[i],set.get(A[i])+1);
            // else
                set.put(A[i],1);          
            for(int j =0; j<=i; j++){
                if(set.containsKey(B[j])){
                    count++;
                }
                ans[i] = count;
            }            
            count = 0;
        }
        return ans;
    }
}